package edu.matheus.exemploPOO;

public abstract sealed class Funcionario permits Vendedor, Gerente{

    private String nome;
    private int idade;
    private String endereco;
    private double salario;

    protected Funcionario(){}

    protected Funcionario(String nome, int idade, String endereco, double salario){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double getFullSalary();
}
