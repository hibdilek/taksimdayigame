package com.ibrahim.game;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button one ;
    MediaPlayer mp = new MediaPlayer() ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.button);
        mp = MediaPlayer.create(this, R.raw.haksim);


    }

    public void haksim(View view){
        if(mp != null && !mp.isPlaying()){
        mp = MediaPlayer.create(this, R.raw.haksim);
        mp.start();}

    }
    public void hello(View view){
        if(mp != null && !mp.isPlaying()){
        mp = MediaPlayer.create(this, R.raw.hello);
        mp.start();}
    }

    public void hawagi(View view){
        if(mp != null && !mp.isPlaying()){
        mp = MediaPlayer.create(this, R.raw.hawagi);
        mp.start();}

    }
    public void uzunhaksim(View view){
        if(mp != null && !mp.isPlaying()) {
            mp = MediaPlayer.create(this, R.raw.uzunhaksim);
            mp.start();
        }
    }
    public void remix(View view){
        if(mp != null && !mp.isPlaying()){
        mp = MediaPlayer.create(this, R.raw.remix);
        mp.start();}

    }
    public void stop(View view){

        mp.stop();
    }
}