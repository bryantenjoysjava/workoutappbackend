package service;
import model.Workout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.WorkoutRepository;

import java.util.List;

@Service
public class WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepository;

    public Workout saveWorkout(Workout workout){
        return workoutRepository.save(workout);
    }

    public void deleteWorkout(Workout workout){
        workoutRepository.delete(workout);
    }

    public List<Workout> getWorkoutsById(Long userId){
        return workoutRepository.findByUserId(userId);
    }

}
