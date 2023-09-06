package com.example.puebliando1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TurismoHome extends AppCompatActivity {
 Button botonVerMas;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turismo_home);

       botonVerMas=findViewById(R.id.botonsitiosturisticos);
        botonVerMas.setOnClickListener(new View.OnClickListener (){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TurismoHome.this,ListaSitiosTuristicos.class);
                startActivity(intent);
            }
        });
    }
}