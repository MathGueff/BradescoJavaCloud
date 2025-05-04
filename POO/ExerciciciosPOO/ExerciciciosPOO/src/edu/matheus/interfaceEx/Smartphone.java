package edu.matheus.interfaceEx;

public class Smartphone implements  VideoPlayer, MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("O smartphone está tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O smartphone está pausando a música");
    }

    @Override
    public void resumeMusic() {
        System.out.println("O smartphone está despausando a música");
    }

    @Override
    public void playVideo() {
        System.out.println("O smartphone está reproduzindo o vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O smartphone está parando o vídeo");
    }

    @Override
    public void resumeVideo() {
        System.out.println("O smartphone está despausando o vídeo");
    }
}
