package service;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import java.util.Optional;

/**
 * Handles user interaction with application
 */

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

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
        Optional<User> optionalUser = userRepository.findByEmail(email);
        if (optionalUser.isPresent()){
            throw new IllegalArgumentException("User already exists");
        }

        User user = new User();
        String encodedPassword = passwordEncoder.encode(password);
        user.setEmail(email);
        user.setPassword(encodedPassword);
        return userRepository.save(user);

    }

    /**
     * checks if user exists through their login information,
     * @param email
     * @param rawPassword
     * @return
     */
    public boolean loginUser(String email, String rawPassword){
        Optional<User> user = userRepository.findByEmail(email);
        if(user.isEmpty()){
            return false;
        }
        return passwordEncoder.matches(rawPassword, user.get().getPassword());
    }


}
