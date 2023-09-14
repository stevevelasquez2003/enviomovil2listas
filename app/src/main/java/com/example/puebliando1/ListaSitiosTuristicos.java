package com.example.puebliando1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.puebliando1.moldes.Moldeturismo;

import java.util.ArrayList;

import adaptadores.AdaptadorSitios;

public class ListaSitiosTuristicos extends AppCompatActivity {
    ArrayList<Moldeturismo> listaturismo = new ArrayList<>();
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios_turisticos);

        recyclerView = findViewById(R.id.listadinamicaturismo);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));


        llenarListaConDatos();
        AdaptadorSitios adaptadorSitios = new AdaptadorSitios(listaturismo);
        recyclerView.setAdapter(adaptadorSitios);
    }
    private void llenarListaConDatos(){
        listaturismo.add(new Moldeturismo("Replica Pueblo Guatape","steven","152436582","$100000",R.drawable.turismouno,"exelente servicio y espectaculares vistas","5.0",R.drawable.listasitiosuno));
        listaturismo.add(new Moldeturismo("Lozas de llamas","steven","152436582","$100000",R.drawable.turismodos,"exelente servicio y espectaculares vistas","4.5",R.drawable.listasitiosdos));
        listaturismo.add(new Moldeturismo("Represa El Peñol","steven","152436582","$100000",R.drawable.turismocuatro,"exelente servicio y espectaculares vistas","4.8",R.drawable.listasitiostres));
    }
}
