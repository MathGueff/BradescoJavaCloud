package edu.matheus.interfaceFuncional;

@FunctionalInterface
public interface Functional {

    int executar(int a, int b);

    default void teste() {
        System.out.println(executar(2,4));
    }
}
