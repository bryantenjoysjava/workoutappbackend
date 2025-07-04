package com.workoutappbackend.workoutappbackend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


/**
 * Represents number of reps in each set for a workout
 */
@Entity
public class Reps {

    /**
     * generated ID for number of reps in set
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    public long getId(){
        return id;
    }

    private int repsCount;

    public int getReps(){
        return repsCount;
    }

    public void setReps(int repsCount){
        this.repsCount = repsCount;
    }

    public Reps(){

    }

}
