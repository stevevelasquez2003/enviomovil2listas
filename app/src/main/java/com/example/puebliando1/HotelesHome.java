package com.example.puebliando1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HotelesHome extends AppCompatActivity {
Button botonVerMas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles_home);

        botonVerMas=findViewById(R.id.botonvermash);
        botonVerMas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelesHome.this,Listahoteles.class);
                startActivity(intent);
            }
        });

    }
}