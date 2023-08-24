package com.example.puebliando1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sitios extends AppCompatActivity {
Button botonVerMasSitios;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios);
        botonVerMasSitios=findViewById(R.id.botonsitiosturistios);
        botonVerMasSitios.setOnClickListener(new View.OnClickListener (){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Sitios.this,ListaSitiosTuristicos.class);
                startActivity(intent);
            }
        });
    }
}