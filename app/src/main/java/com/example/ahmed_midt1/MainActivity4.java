package com.example.ahmed_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity4 extends AppCompatActivity {
    int play;
    MediaPlayer lion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        lion = new MediaPlayer();
        lion = MediaPlayer.create(this, R.raw.lion);
        lion.start();
    }
}