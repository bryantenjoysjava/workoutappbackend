package com.workoutappbackend.workoutappbackend;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
}
