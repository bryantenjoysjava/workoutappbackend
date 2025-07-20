package model;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Workout {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String workout;

    public String getWorkout(){
        return workout;
    }

    public void setWorkout(String workout){
        this.workout = workout;
    }

    /**
     * One Workout class will contain many Exercise class objects
     */
    @OneToMany(mappedBy = "workout" , cascade = CascadeType.ALL)
    private List<Exercise> exercises;

    /**
     * Many Workout classes will be encapsulated inside one User class
     */
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
