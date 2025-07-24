package model;
import jakarta.persistence.*;

import java.util.List;

/**
 * Represents user in workout application
 */
@Entity
public class User {

    public User(){

    }

    //generated ID of the user entity
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    public long getId(){
        return id;
    }

    //email address object for workout user
    private String email;

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }


    //password data field for login
    private String password;

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    //status of user account
    private boolean isDeleted = false;

    public boolean getIsDeleted(){
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted){
        this.isDeleted = isDeleted;
    }


    @OneToMany
    private List<Workout> workouts;

}
