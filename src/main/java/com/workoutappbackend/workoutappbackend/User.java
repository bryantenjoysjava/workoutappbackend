package com.workoutappbackend.workoutappbackend;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

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
     * email address used for login
     */
    private String email;

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    /**
     * password used for login
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
}
