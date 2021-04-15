package com.example.solidprinciple.interface_segregation.bad;

public class VLCMediaPlayer implements MediaPlayer {

    @Override
    public void playAudio() {
        System.out.println("Playing audio...");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video...");
    }
}
