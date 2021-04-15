package com.example.solidprinciple.interface_segregation.good;

public class AudioMediaPlayer implements AudioPlayer {
    @Override
    public void playAudio() {
        System.out.println("Playing audio...");
    }
}
