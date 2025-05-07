package edu.matheus.list;

import edu.matheus.exercicio.Biblioteca;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();
        b.adicionarLivro("Pequeno Príncipe", "Rick", LocalDate.of(2020, Month.APRIL, 20));
        b.adicionarLivro("O Mundo Escondido", "Albert Einstein", LocalDate.of(2022, Month.JANUARY, 10));
        b.adicionarLivro("Paris Voando", "Robert California", LocalDate.of(2019, Month.AUGUST, 2));
        b.adicionarLivro("Entre Latidos e Miados", "Rodrigo Banana", LocalDate.of(2000, Month.FEBRUARY, 3));
        System.out.println(b.ordenarPorNome());
    }
}
