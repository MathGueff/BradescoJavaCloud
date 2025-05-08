package main.java;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private Set<Conta> contas;

    public Banco(){
        this.contas = new HashSet<>();
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public void removerConta(Conta conta){
        contas.remove(conta);
    }

    public void listarExtratoContas(){
        contas.forEach(Conta::imprimirExtrato);
    }
}
