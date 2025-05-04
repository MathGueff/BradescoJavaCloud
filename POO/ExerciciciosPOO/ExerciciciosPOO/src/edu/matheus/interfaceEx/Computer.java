package edu.matheus.interfaceEx;

public class Computer implements  VideoPlayer{
    @Override
    public void playVideo() {
        System.out.println("O computador está tocando o vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O computador está pausando o vídeo");
    }

    @Override
    public void resumeVideo() {
        System.out.println("O computador está despausando o vídeo");
    }
}
