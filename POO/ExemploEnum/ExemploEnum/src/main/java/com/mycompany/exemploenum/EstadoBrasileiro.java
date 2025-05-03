/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploenum;

/**
 *
 * @author MathGueff
 */
public enum EstadoBrasileiro{
    CACHORRO ("LATIR", 50),
    GATO ("MIAR", 30);
    private String acao;
    private int forca;
    
    private EstadoBrasileiro(String acao, int forca){
        this.acao = acao;
        this.forca = forca;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
}
