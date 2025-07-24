package service;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * UserService class constructor
     * @param userRepository
     * @param passwordEncoder
     */
    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder){
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    /**
     * adds user to repository if the user does not already exist
     * @param email
     * @param password
     * @return
     */
    public User registerUser(String email, String password){
        if (userRepository.findByEmail(email).isPresent()){
            throw new IllegalArgumentException("User already exists");
        }

        User user = new User();
        String encodedPassword = passwordEncoder.encode(password);
        user.setEmail(email);
        user.setPassword(encodedPassword);
        return userRepository.save(user);

    }

    /**
     * logins user to application
     * @param email
     * @param rawPassword
     * @return
     */
    public boolean loginUser(String email, String rawPassword){
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        return passwordEncoder.matches(rawPassword, user.getPassword());
    }

    /**
     * resets user password
     * @param email
     * @param rawPassword
     * @param newPassword
     * @return
     */
    public void resetPassword(String email, String rawPassword, String newPassword){

        User user = userRepository.findByEmail(email)
                //checks if user exists
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        //resets user password
        if (!passwordEncoder.matches(rawPassword, user.getPassword())){
            throw new IllegalArgumentException("Incorrect Password");
        }

        user.setPassword(passwordEncoder.encode(newPassword));
        userRepository.save(user);
    }

    /**
     * deletes user's account
     * @param email
     * @return
     */
    public void deleteUser(String email, String rawPassword){
        User user = userRepository.findByEmail(email)
                //checks if user exists
                .orElseThrow(() -> new IllegalArgumentException("User not found"));


        if(passwordEncoder.matches(rawPassword, user.getPassword())){
            user.setIsDeleted(true);
        } else{
            throw new IllegalArgumentException("Incorrect Password");
        }

        userRepository.save(user);
    }

}
