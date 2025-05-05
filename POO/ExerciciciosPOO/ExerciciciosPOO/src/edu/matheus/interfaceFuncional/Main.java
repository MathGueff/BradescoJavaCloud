package edu.matheus.interfaceFuncional;

public class Main {
    public static void main(String[] args) {
        var teste = new Functional() {
            @Override
            public int executar(int a, int b) {
                return a + b + 3;
            }
        };
        var animal = new Animal();
        teste.teste();
    }
}
