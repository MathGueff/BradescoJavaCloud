package edu.matheus.exercicio1;

public enum CleanState {
    DIRTY(32.00, "32"),
    CLEAN(24.00, "2");


    CleanState(double price, String hours){
        this.price = price;
        this.hours = hours;
    }
    private double price;
    private String hours;
}
