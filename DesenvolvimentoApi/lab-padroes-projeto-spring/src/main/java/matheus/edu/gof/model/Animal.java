package matheus.edu.gof.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import matheus.edu.gof.enums.EspecieEnum;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String dataNascimento;
    private EspecieEnum especie;

    public Animal(String nome, String dataNascimento, EspecieEnum especie) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public EspecieEnum getEspecie() {
        return especie;
    }

    public void setEspecie(EspecieEnum especie) {
        this.especie = especie;
    }
}
