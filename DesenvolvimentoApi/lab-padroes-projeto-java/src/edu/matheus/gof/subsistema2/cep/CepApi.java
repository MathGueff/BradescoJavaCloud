package edu.matheus.gof.subsistema2.cep;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi(){}

    public static CepApi getInstancia() {
        return instancia;
    }

    public static String recuperarCidade(String cep){
        return "Sorocaba";
    }
    public static String recuperarEstado(String cep){
        return "SP";
    }
}
