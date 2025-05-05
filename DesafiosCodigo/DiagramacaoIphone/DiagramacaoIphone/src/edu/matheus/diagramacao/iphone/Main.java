package edu.matheus.diagramacao.iphone;

public class Main {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.setNumero("1010");
        Iphone iphone2 = new Iphone();
        iphone2.setNumero("5515");
        Iphone iphone3 = new Iphone();
        iphone3.setNumero("5510");

        System.out.println("----");
        System.out.println("Acessando a WEB");
        iphone.exibirPagina("https://site.com.br");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://localhost:3000");

        System.out.println("----");
        System.out.println("Música");
        iphone.selecionarMusica("Evidências");
        iphone.tocar();
        iphone.pausar();
        System.out.println("----");
        System.out.println("Ligação");
        iphone.ligar("5515");
        iphone2.atender(iphone.getNumeroLigando());
        iphone3.atender(iphone.getNumeroLigando());
        iphone.iniciarCorreioVoz();
    }
}
