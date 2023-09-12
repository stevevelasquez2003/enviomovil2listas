package com.example.puebliando1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.puebliando1.moldes.Moldeturismo;

public class AmpliandoTurismo extends AppCompatActivity {

        Moldeturismo moldeturismo;
        ImageView fotoAmpliandoTurismo;
        TextView nombreAmpliandoTurismo;
        TextView precioAmpliandoTurismo;
        TextView telefonoAmpliandoTurismo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_turismo);

        fotoAmpliandoTurismo = findViewById(R.id.imagenAmpliandoT);
        nombreAmpliandoTurismo = findViewById(R.id.nombreTurismoA);
        precioAmpliandoTurismo = findViewById(R.id.precioTurismoA);
        telefonoAmpliandoTurismo = findViewById(R.id.telefonoTurismoA);

        moldeturismo=(Moldeturismo)getIntent().getSerializableExtra("datosturismo");

        fotoAmpliandoTurismo.setImageResource(moldeturismo.getFoto());
        nombreAmpliandoTurismo.setText(moldeturismo.getNombre());
        precioAmpliandoTurismo.setText(moldeturismo.getPrecio());
        telefonoAmpliandoTurismo.setText(moldeturismo.getTelefono());
    }
}