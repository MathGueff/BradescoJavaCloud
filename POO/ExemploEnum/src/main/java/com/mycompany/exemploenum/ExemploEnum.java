/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemploenum;

/**
 *
 * @author MathGueff
 */
public class ExemploEnum {

    public static void main(String[] args) {
        for(EstadoBrasileiro e : EstadoBrasileiro.values()){
            System.out.println("O animal vai " + e.getAcao() + ", causou " + e.getForca() + " de dano");
        }
    }
}
