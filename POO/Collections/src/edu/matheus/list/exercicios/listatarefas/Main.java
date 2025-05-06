package edu.matheus.list.exercicios.listatarefas;

public class Main {

    public static void main(String[] args) {
        ListaTarefas lt = new ListaTarefas();
        System.out.println("Número total de tarefas: " + lt.obterNumeroTotalTarefas());
        lt.adicionarTarefa("Fazer algo");
        lt.adicionarTarefa("Fazer algo");
        lt.adicionarTarefa("Fazer algo");
        lt.adicionarTarefa("Fazer algo a mais");
        lt.obterDescricoesTarefas();
        System.out.println("Número total de tarefas: " + lt.obterNumeroTotalTarefas());
        lt.removerTarefa("Fazer algo");
        System.out.println("Número total de tarefas: " + lt.obterNumeroTotalTarefas());
    }
}
