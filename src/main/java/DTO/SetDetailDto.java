package DTO;

public class SetDetailDto {
    private int sets;
    private int reps;

    public SetDetailDto(int reps, int sets) {
        this.reps = reps;
        this.sets = sets;
    }

    public int getReps(){
        return reps;
    }

    public int getSets(){
        return sets;
    }

}
