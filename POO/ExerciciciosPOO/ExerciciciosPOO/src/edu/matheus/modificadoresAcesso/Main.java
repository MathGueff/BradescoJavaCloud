package edu.matheus.modificadoresAcesso;

public class Main {

    public static void main(String[] args) {
        var cliente = new Cliente();
        Vendedor vendedor = new Vendedor();

        cliente.getIdade();
        vendedor.getIdade();
    }

}
