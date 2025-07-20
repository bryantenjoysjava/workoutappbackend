package model;
import jakarta.persistence.*;

import java.util.List;

/**
 * Represents user in workout application
 */
@Entity
public class User {

    /**
     *generated ID of the user entity
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    public long getId(){
        return id;
    }

    /**
     * email address data field used for login
     */
    private String email;

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    /**
     * password data field for login
     */
    private String password;

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public User(){

    }

    /**
     * One User class will contain many Workout class objects
     */
    @OneToMany
    private List<Workout> workouts;

}
