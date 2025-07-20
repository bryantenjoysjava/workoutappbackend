package model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Exercise {

    /**
     * Generated ID for exercise class
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    /**
     * exercise data field
     */
    private String name;


    /**
     * Many Exercise classes will be encapsulated inside one Workout class
     */
    @ManyToOne
    @JoinColumn(name = "workout_id")
    private Workout workout;

    @OneToMany(mappedBy = "exercise" , cascade = CascadeType.ALL)
    List<SetDetail> setDetailList = new ArrayList<>();



}
