package edu.matheus.gof.singleton;

/**
 * Singleton Preguiçoso
 *
 * @author MathGueff
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}