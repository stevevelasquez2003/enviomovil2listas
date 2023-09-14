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
        TextView comentario;
        TextView valoracion;
        ImageView fotoampliandoturismo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_turismo);

        fotoAmpliandoTurismo = findViewById(R.id.imagenAmpliandoT);
        nombreAmpliandoTurismo = findViewById(R.id.nombreTurismoA);
        precioAmpliandoTurismo = findViewById(R.id.precioTurismoA);
        telefonoAmpliandoTurismo = findViewById(R.id.telefonoTurismoA);
        comentario = findViewById(R.id.comentariotam);
        valoracion = findViewById(R.id.valoracionturismo);
        fotoampliandoturismo = findViewById(R.id.imagenampliandoturismo);

        moldeturismo=(Moldeturismo)getIntent().getSerializableExtra("datossitios");

        fotoAmpliandoTurismo.setImageResource(moldeturismo.getFoto());
        nombreAmpliandoTurismo.setText(moldeturismo.getNombre());
        precioAmpliandoTurismo.setText(moldeturismo.getPrecio());
        telefonoAmpliandoTurismo.setText(moldeturismo.getTelefono());
        comentario.setText(moldeturismo.getComentario());
        valoracion.setText(moldeturismo.getValoracion());
        fotoampliandoturismo.setImageResource(moldeturismo.getImagent());

    }
}