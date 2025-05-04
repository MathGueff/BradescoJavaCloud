package edu.matheus.interfaceEx;

public class Main {
    public static void main(String[] args) {
        Smartphone p = new Smartphone(); //Smartphone implementa Video e Music
        Computer c = new Computer(); //Computer implementa Video
        MusicBox m = new MusicBox(); //MusicBox implementa Music
        runVideo(p); //‘Smartphone’ toca vídeo
        runMusic(p); //‘Smartphone’ toca vídeo
        runVideo(c); //Computer toca vídeo
        runMusic(m); //Music Box toca vídeo

        //Computer não pode tocar música
        //runMusic(c);s

        //Music Box não pode tocar vídeo
        //runVideo(m);

    }
    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }
}
