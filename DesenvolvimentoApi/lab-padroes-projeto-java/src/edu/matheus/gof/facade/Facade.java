package edu.matheus.gof.facade;

import edu.matheus.gof.subsistema1.crm.CrmService;
import edu.matheus.gof.subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.recuperarCidade(cep);
        String estado = CepApi.recuperarEstado(cep);

        CrmService.gravarCliente(nome, cidade, estado, cep);
    }
}
