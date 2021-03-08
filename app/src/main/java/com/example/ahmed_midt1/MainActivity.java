package com.example.ahmed_midt1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int play;
    MediaPlayer lion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bttn1 = (Button) findViewById(R.id.button);
        Button bttn2 = (Button) findViewById(R.id.button2);
        lion = new MediaPlayer();
        lion = MediaPlayer.create(this, R.raw.lion);
        ImageView img = (ImageView) findViewById(R.id.imageView);
        play = 0;
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (play) {
                    case 0:
                        lion.start();
                        play = 1;
                        break;
                    case 1:
                        lion.pause();
                        play = 0;
                        break;
                }
            }
        });
        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });
        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity3.class));
            }
        });
    }
}