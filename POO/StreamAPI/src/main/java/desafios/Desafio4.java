package main.java.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio4 {
    public static void main(String[] args) {
        //Desafio 4 - Remova todos os valores ímpares:

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> verificaPar = n-> n%2 ==0;

        numeros.stream().filter(verificaPar).sorted().forEach(System.out::println);

    }
}