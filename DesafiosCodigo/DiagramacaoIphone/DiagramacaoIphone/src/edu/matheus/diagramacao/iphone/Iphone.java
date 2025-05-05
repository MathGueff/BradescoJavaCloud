package edu.matheus.diagramacao.iphone;

import edu.matheus.diagramacao.iphone.interfaces.*;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private String numero;
    private String urlAtual;
    private String musicaAtual;
    private String numeroLigando;

    public String getNumeroLigando() {
        return numeroLigando;
    }

    public void setNumeroLigando(String numeroLigando) {
        this.numeroLigando = numeroLigando;
    }

    public String getMusicaAtual() {
        return musicaAtual;
    }

    public void setMusicaAtual(String musicaAtual) {
        this.musicaAtual = musicaAtual;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getUrlAtual() {
        return urlAtual;
    }

    public void setUrlAtual(String urlAtual) {
        this.urlAtual = urlAtual;
    }

    @Override
    public void tocar() {
        System.out.println("O telefone está tocando a música " + getMusicaAtual());
    }

    @Override
    public void pausar() {
        System.out.println("O telefone está pausando a música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("O telefone está selecionando a música");
        setMusicaAtual(musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("O telefone está ligando para o número " + numero);
        setNumeroLigando(numero);
    }

    @Override
    public void atender(String numero) {
        if(getNumero().equals(numero))
            System.out.println("O telefone está atendendo");
        else
            System.out.println("Não é meu número");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("O telefone está iniciando o correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("O telefone está exibindo a página com url " + url);
        setUrlAtual(url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("O telefone está adicionando uma nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("O telefone está atualizando a página " +getUrlAtual());
    }
}
