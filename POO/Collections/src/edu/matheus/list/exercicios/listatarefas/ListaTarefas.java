package edu.matheus.list.exercicios.listatarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemocao = new ArrayList<>();
        for(Tarefa t : tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemocao.add(t);
            }
        }
        tarefas.removeAll(tarefasParaRemocao);
    }

    int obterNumeroTotalTarefas(){
        return tarefas.size();
    }

    void obterDescricoesTarefas() {
        System.out.println(tarefas);
    }
}
