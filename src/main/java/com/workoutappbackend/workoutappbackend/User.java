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
     *unique number for the id of the user
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    /**
     * email address used for login
     */
    private String email;

    /**
     * password used for login
     */
    private String password;

    /**
     * no-argument constructor used for JPA
     */
    public User(){

    }
}
