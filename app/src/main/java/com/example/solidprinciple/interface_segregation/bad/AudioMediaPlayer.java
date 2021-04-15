package com.example.solidprinciple.interface_segregation.bad;


public class AudioMediaPlayer implements MediaPlayer {
    @Override
    public void playAudio() {
        System.out.println("Playing audio...");
    }

    @Override
    public void playVideo() {
        System.out.println("This player not support video");
    }
}
