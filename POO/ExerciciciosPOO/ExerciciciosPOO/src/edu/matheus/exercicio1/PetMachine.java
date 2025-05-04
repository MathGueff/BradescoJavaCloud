package edu.matheus.exercicio1;

import java.util.ArrayList;

public class PetMachine {

    private ArrayList<Pet> pet;
    private CleanState cleanState;

    public ArrayList<Pet> getPet() {
        return pet;
    }

    public void setPet(ArrayList<Pet> pet) {
        this.pet = pet;
    }

    public CleanState getCleanState() {
        return cleanState;
    }

    public void setCleanState(CleanState cleanState) {
        this.cleanState = cleanState;
    }
}
