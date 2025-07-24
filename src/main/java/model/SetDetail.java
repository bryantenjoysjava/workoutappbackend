package model;
import jakarta.persistence.*;

/**
 * Represents sets and reps object in workout applications
 */
@Entity
public class SetDetail {


    //generated ID for setsDetail class
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE  )
    private long id;

    //sets and reps data fields

    private int sets;
    private int reps;

    public int getSets(){
        return sets;
    }

    public void setSets(int sets){
        this.sets = sets;
    }

    public int getReps(){
        return reps;
    }

    public void setReps(int reps){
        this.reps = reps;
    }

    public SetDetail(){

    }

    @ManyToOne
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;
}
