package com.example.puebliando1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.puebliando1.moldes.Moldehotel;

public class AmpliandoHotel extends AppCompatActivity {

    Moldehotel moldehotel;
    ImageView fotoAmpliandoHotel;
    TextView nombreAmpliandoHotel;
    TextView precioAmpliandoHotel;
    TextView telefonoAmpliandoHotel;
    TextView descripcionHotel;
    TextView valoracion;
    ImageView fotoampliandohotel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);
        fotoAmpliandoHotel = findViewById(R.id.imagenAmpliandoHotel);
        nombreAmpliandoHotel = findViewById(R.id.nombrehotelA);
        precioAmpliandoHotel = findViewById(R.id.preciohotelA);
        telefonoAmpliandoHotel = findViewById(R.id.telefonohotelA);
        descripcionHotel = findViewById(R.id.descripcionH);
        valoracion = findViewById(R.id.valoracionHotel);
        fotoampliandohotel = findViewById(R.id.imagenampliandohotel);
        moldehotel=(Moldehotel)getIntent().getSerializableExtra("datoshotel");

        fotoAmpliandoHotel.setImageResource(moldehotel.getFoto());
        nombreAmpliandoHotel.setText(moldehotel.getNombre());
        precioAmpliandoHotel.setText(moldehotel.getPrecio());
        telefonoAmpliandoHotel.setText(moldehotel.getTelefono());
        descripcionHotel.setText(moldehotel.getDescripcion());
        valoracion.setText(moldehotel.getValoracion());
        fotoampliandohotel.setImageResource(moldehotel.getImagen());

    }
}