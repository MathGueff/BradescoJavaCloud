package main.java.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Desafio 2 - Imprima a soma dos números pares da lista:
        Predicate<Integer> filtroNumerosPares = n -> n%2 == 0;
        BinaryOperator<Integer> somaPares = Integer::sum;

        int resultado = numeros.stream().filter(filtroNumerosPares).reduce(0, somaPares);

        System.out.println(resultado);
    }
}