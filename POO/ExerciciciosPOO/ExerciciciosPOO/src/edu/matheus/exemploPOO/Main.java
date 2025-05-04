package edu.matheus.exemploPOO;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá mundo, confira nossos funcionários: ");
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Vendedor());
        funcionarios.add(new Gerente());
        for (Funcionario f : funcionarios){
            drawLines();
            System.out.println("Funcionário:");
            createFuncionario(f);
            drawLines();
        }
    }

    static void createFuncionario(Funcionario funcionario){
        funcionario.setNome("Carlinhos");
        funcionario.setEndereco("Rua Alberto Carlos");
        funcionario.setSalario(200.00);
        funcionario.setIdade(33);
        switch (funcionario){
            case Vendedor vendedor -> {
                vendedor.setQtdVendas(3);
                System.out.println("Nome: " + vendedor.getNome());
                System.out.println("Endereço: " + vendedor.getEndereco());
                System.out.println("Idade: " + vendedor.getIdade());
                System.out.println("Quantidade de vendas: " + vendedor.getQtdVendas());
                System.out.println("Salário: " + vendedor.getFullSalary(12));
            }
            case Gerente gerente -> {
                gerente.setComissao(12000);
                gerente.setLogin("gerente");
                gerente.setPassword("123");
                System.out.println("Nome: " + gerente.getNome());
                System.out.println("Endereço: " + gerente.getEndereco());
                System.out.println("Idade: " + gerente.getIdade());
                System.out.println("Login: " + gerente.getLogin());
                System.out.println("Senha: " + gerente.getPassword());
            }
        }
        System.out.println("Salário: " + funcionario.getFullSalary());
    }

    static void drawLines(){
        System.out.println("-------------------");
    }
}
