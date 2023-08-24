package com.example.puebliando1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    //ATRIBUTOS= SON ELEMENTOS DE LA ACTIVIDAD
    MediaPlayer cancion;

//METODOS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cancion=MediaPlayer.create(this,R.raw.audio);
        cancion.start();

        //TEMPORIZAMOS el splash
        TimerTask inicioAPP=new TimerTask() {
            @Override
            public void run() {
                //lanzo el home o activo el home
                Intent lanzamiento= new Intent(MainActivity.this,Login.class);
                startActivity(lanzamiento);

            }
        };
        Timer tiempo= new Timer();
        tiempo.schedule(inicioAPP,10000);


    }
}