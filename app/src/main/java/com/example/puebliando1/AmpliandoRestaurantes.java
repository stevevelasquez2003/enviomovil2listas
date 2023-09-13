package com.example.puebliando1;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.puebliando1.moldes.MoldeRestaurantes;

public class AmpliandoRestaurantes extends AppCompatActivity {
    MoldeRestaurantes moldeRestaurantes;
    ImageView fotoAmpliandoRestaurantes;
    TextView nombreAmpliandoRestaurantes;
    TextView precioAmpliandoRestaurantes;
    TextView telefonoAmpliandoRestaurantes;
    TextView comentario;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_restaurantes);

        fotoAmpliandoRestaurantes = findViewById(R.id.imagenAmpliandoR);
        nombreAmpliandoRestaurantes = findViewById(R.id.nombreRestaurantesA);
        precioAmpliandoRestaurantes = findViewById(R.id.precioRestauranteA);
        telefonoAmpliandoRestaurantes = findViewById(R.id.telefonoRestauranteA);
        comentario = findViewById(R.id.comentario);

        moldeRestaurantes = (MoldeRestaurantes)getIntent().getSerializableExtra("datosrestaurantes");

        fotoAmpliandoRestaurantes.setImageResource(moldeRestaurantes.getFoto());
        nombreAmpliandoRestaurantes.setText(moldeRestaurantes.getNombre());
        precioAmpliandoRestaurantes.setText(moldeRestaurantes.getRangoPrecio());
        telefonoAmpliandoRestaurantes.setText(moldeRestaurantes.getTelefono());
        comentario.setText(moldeRestaurantes.getComentario());
    }
}