package edu.matheus.exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        PetMachine petMachine = new PetMachine();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos pets serão adicionados?");
        int qtdPets = sc.nextInt();
        ArrayList<Pet> pets = new ArrayList<>();
        for (int i = 0; i < qtdPets; i++) {
            Pet pet = new Pet();
            System.out.println("Nome do pet nº" + i + "?");
            String petName = sc.next();
            pet.setName(petName);
            pets.add(pet);
        }
        petMachine.setPet(pets);
        String nomes = "";

        for (Pet p : petMachine.getPet()){
            nomes += "\n" + p.getName();
        }
        System.out.println("Pets que estão sendo lavados: " + nomes);
    }
}
