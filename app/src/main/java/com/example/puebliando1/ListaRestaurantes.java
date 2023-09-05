package com.example.puebliando1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.puebliando1.moldes.MoldeRestaurantes;

import java.util.ArrayList;


import adaptadores.AdaptadorRestaurantes;

public class ListaRestaurantes extends AppCompatActivity {
    ArrayList<MoldeRestaurantes> listaRestaurantes = new ArrayList<>();
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);

        recyclerView = findViewById(R.id.listadinamicarestaurantes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));

        llenarListaConDatos();
        AdaptadorRestaurantes adaptadorRestaurantes = new AdaptadorRestaurantes(listaRestaurantes);
        recyclerView.setAdapter(adaptadorRestaurantes);
    }

    private void llenarListaConDatos() {
        listaRestaurantes.add(new MoldeRestaurantes("Al Carbón Parrilla Bar",R.drawable.restauranteuno,"325614495","$150000 COP","SOLOMITO "));
        listaRestaurantes.add(new MoldeRestaurantes("Casa de Cielo",R.drawable.restaurantedos,"312458475","$250000 COP","MARISCOS"));
        listaRestaurantes.add(new MoldeRestaurantes("Placido Gourmet",R.drawable.restaurantetres,"215463248","$190000 COP","SALMON"));
        listaRestaurantes.add(new MoldeRestaurantes("La Fiesta Espresso",R.drawable.restaurantecuatro,"332625234"," $155000 COP ","SUSHI"));
        listaRestaurantes.add(new MoldeRestaurantes("Le Gros Luxe",R.drawable.restaurantecinco,"315425214","185000","TRUCHA "));
        listaRestaurantes.add(new MoldeRestaurantes("Bella Grande Restaurant",R.drawable.restauranteseis,"214265324","$150000 COP","Casuela de mariscos"));


    }
}
