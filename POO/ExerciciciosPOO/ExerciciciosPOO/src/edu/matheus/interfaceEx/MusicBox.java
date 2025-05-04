package edu.matheus.interfaceEx;

public class MusicBox implements  MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("O musicBox está tocando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O musicBox está pausando a música");
    }

    @Override
    public void resumeMusic() {
        System.out.println("O musicBox está despausando a música");
    }
}
