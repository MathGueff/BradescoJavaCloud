package edu.matheus.exercicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
    List<Livro> livrosList;

    public Biblioteca() {
        livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String nome, String autor, LocalDate dataPublicacao){
        livrosList.add(new Livro(nome, autor, dataPublicacao));
    }

    public List<Livro> ordenarPorNome(){
        List<Livro> livrosOrdenadosPorNome = new ArrayList<>(livrosList);
        if(livrosList.isEmpty())
           throw new RuntimeException("A lista de livros está vazia");
        Collections.sort(livrosOrdenadosPorNome);
        return livrosOrdenadosPorNome;
    }
}
