package edu.matheus.exercicio;

import java.time.LocalDate;

public class Livro implements Comparable<Livro>{
    private String nome;
    private String autor;
    private LocalDate dataPublicacao;

    public Livro(String nome, String autor, LocalDate dataPublicacao) {
        this.nome = nome;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", dataPublicacao=" + dataPublicacao +
                '}';
    }

    @Override
    public int compareTo(Livro l) {
        return this.nome.compareTo(l.getNome());
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}
