package com.example.soundsapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView dog;
    private ImageView cat;
    private MediaPlayer dogSound;
    private MediaPlayer catSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dog = findViewById(R.id.dog);
        cat = findViewById(R.id.cat);
        dogSound = MediaPlayer.create(this,R.raw.dog_barking);
        catSound = MediaPlayer.create(this,R.raw.cat_sound);

        imageClick();
    }

    public void imageClick(){
        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlay(dogSound);
            }
        });

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlay(catSound);
            }
        });
    }

    public void soundPlay(MediaPlayer player){
        player.start();
    }
}
