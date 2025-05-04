package edu.matheus.exemploPOO;

public final class Vendedor extends Funcionario{
    private int qtdVendas;

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public double getQtdVendas() {
        return qtdVendas;
    }

    Vendedor() {}
    Vendedor(String nome, int idade, String endereco, double salario,int qtdVendas) {
        super(nome, idade, endereco, salario);
        this.qtdVendas = qtdVendas;
    }

    @Override
    public double getFullSalary() {
        return this.getSalario() * this.getQtdVendas();
    }

    public double getFullSalary(double extraMAIS){
        return this.getFullSalary() * extraMAIS * 10;
    }
}
