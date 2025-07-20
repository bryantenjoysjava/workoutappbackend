package DTO;

public class WorkoutDto {
    private String workout;

    public WorkoutDto(String workout){
        this.workout = workout;
    }

    public String getWorkout(){
        return workout;
    }
}
