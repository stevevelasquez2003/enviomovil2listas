package com.example.puebliando1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.puebliando1.moldes.Moldehotel;

public class AmpliandoHotel extends AppCompatActivity {

    Moldehotel moldehotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ampliando_hotel);

        moldehotel=(Moldehotel)getIntent().getSerializableExtra("datoshotel");
        Toast.makeText(this, moldehotel.getNombre(), Toast.LENGTH_LONG).show();
    }
}