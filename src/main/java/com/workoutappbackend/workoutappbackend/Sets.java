package com.workoutappbackend.workoutappbackend;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.annotation.processing.Generated;

/**
 * Represents sets object in workout applications
 */
@Entity
public class Sets {

    /**
     *generated ID of the sets
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE  )
    private int setsCount;

    public int getSetsCount(){
        return setsCount;
    }

    public void setSetsCount(int setsCount){
        this.setsCount = setsCount;
    }
    public Sets(){

    }
}
