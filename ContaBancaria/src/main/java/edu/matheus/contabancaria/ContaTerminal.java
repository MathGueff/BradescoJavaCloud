/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.matheus.contabancaria;

import java.util.Scanner;

/**
 *
 * @author MathGueff
 */
public class ContaTerminal {
    
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da agência");
        agencia = sc.next();
        
        System.out.println("Digite o número da agência");
        numero = sc.nextInt();
        
        System.out.println("Digite o seu nome");
        nomeCliente = sc.next();
        
        System.out.println("Digite o saldo");
        saldo = sc.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo  + " já está disponível para saque");
    }
}
