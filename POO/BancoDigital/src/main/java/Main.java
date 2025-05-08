package main.java;

public class Main {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Julia");
        Cliente cli2 = new Cliente("Ricardo");
        Conta conta1= new ContaCorrente(cli1);
        Conta conta2 = new ContaPoupanca(cli2);

        Banco banco = new Banco();
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);
        banco.listarExtratoContas();
    }
}
