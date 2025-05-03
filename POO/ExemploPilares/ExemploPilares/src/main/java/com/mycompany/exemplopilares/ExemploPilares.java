/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplopilares;

import java.util.Scanner;

/**
 *
 * @author MathGueff
 */
public class ExemploPilares {

    public static void main(String[] args) {
        
        Animal animalzinho = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome de animal");
        String animalPreferido =sc.next();
        
        switch (animalPreferido) {
            case "cachorro":
                animalzinho = new Cachorro();
                break;
            case "gato":
                animalzinho = new Gato();
                break;
        }
        animalzinho.fazerSom();
    }
}
