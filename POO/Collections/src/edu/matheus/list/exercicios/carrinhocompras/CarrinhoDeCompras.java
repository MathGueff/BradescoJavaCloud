package edu.matheus.list.exercicios.carrinhocompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> itens;
    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    void adicionarItem(String nome, double preco, int quantidade){
        itens.add(new Item(nome, preco, quantidade));
    }

    void removerItem(String nome){
        List<Item> itensParaRemocao = new ArrayList<>();

        for(Item i : itens){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemocao.add(i);
            }
        }

        itens.removeAll(itensParaRemocao);
    }

    double calcularValorTotal(){
        double valorTotal = 0;
        for(Item i : itens){
            valorTotal += i.getPreco();
        }
        return valorTotal;
    }

    void exibirItems(){
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras c = new CarrinhoDeCompras();

        c.adicionarItem("Bike", 289,2);
        c.adicionarItem("Cachorro", 10000, 5);
        System.out.println("Valor total: " + c.calcularValorTotal());
        c.exibirItems();
    }
}


