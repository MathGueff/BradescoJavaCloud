package edu.matheus.gof.strategy;

public class Main {
    public static void main(String[] args) {
        Comportamento comportamentoNormal = new ComportamentoNormal();
        Comportamento comportamentoDefensivo = new ComportamentoDefensivo();
        Comportamento comportamentoAgressivo = new ComportamentoAgressivo();
        Robo robo = new Robo();
        robo.setComportamento(comportamentoNormal);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.setComportamento(comportamentoDefensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(comportamentoAgressivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }

}
