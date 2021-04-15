package com.example.solidprinciple.interface_segregation.good;

public class VLCMediaPlayer implements AudioPlayer, VideoPlayer {
    @Override
    public void playAudio() {
        System.out.println("Playing audio...");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video...");
    }
}
