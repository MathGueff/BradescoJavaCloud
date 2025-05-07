package main.java.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //Desafio 3 - Verifique se todos os números da lista são positivos:
        List<Integer> numerosComNegativo = Arrays.asList(-1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> verificaPositivo = n -> n >= 0;

        boolean todosPositivos = numeros.stream().allMatch(verificaPositivo);
        boolean todosPositivosNaSegundaLista = numerosComNegativo.stream().allMatch(verificaPositivo);
        System.out.println(todosPositivos ? "Todos números são positivos" : "Nem todos números são positivos");
        System.out.println("Valor da variável: " + todosPositivos);

        System.out.println("-------");
        System.out.println("Na segunda lista: " + todosPositivosNaSegundaLista);
    }
}