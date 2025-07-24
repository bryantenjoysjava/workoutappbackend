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


    @OneToMany(mappedBy = "workout" , cascade = CascadeType.ALL)
    private List<Exercise> exercises;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
