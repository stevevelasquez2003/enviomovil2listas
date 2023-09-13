package com.example.puebliando1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.puebliando1.moldes.Moldehotel;

import java.util.ArrayList;

import adaptadores.AdaptadorHoteles;

public class Listahoteles extends AppCompatActivity {
    ArrayList<Moldehotel> listaHoteles = new ArrayList<>();

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listahoteles);

        recyclerView = findViewById(R.id.listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorHoteles adaptadorHoteles = new AdaptadorHoteles(listaHoteles);
        recyclerView.setAdapter(adaptadorHoteles);
    }

    private void llenarListaConDatos() {
        listaHoteles.add(new Moldehotel("HOTEL LA PALMA","$155000","251648932",R.drawable.hoteluno,"hotel espectacular","3.0",R.drawable.hoteldos));
        listaHoteles.add(new Moldehotel("HOTEL LA ROSA","$180000","342512654",R.drawable.hoteldos,"cavañas al aire libre","5.0",R.drawable.hotelcuatro));
        listaHoteles.add(new Moldehotel("HOTEL LA LOMA","$185000","263514788",R.drawable.hoteltres,"hotel en las montañas","5.0",R.drawable.hoteluno));
        listaHoteles.add(new Moldehotel("HOTEL LA GLAUTIER","$190000","321625148",R.drawable.hotelcuatro,"hotel al lado de la represa","4.5",R.drawable.hotelcinco));
        listaHoteles.add(new Moldehotel("HOTEL LA EXTINTO","$195000","320625941",R.drawable.hotelcinco,"lujoso hotel al lado de el peñol","3.5",R.drawable.hoteltres));
        listaHoteles.add(new Moldehotel("HOTEL LA INSTINTO","$300000","234451698",R.drawable.hotelseis,"hotel en la playa","4.0",R.drawable.hotelseis));

    }
}