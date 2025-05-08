package main.java;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("EXTRATO DA CONTA POUPANCA");
        super.imprimirExtrato();
    }
}
