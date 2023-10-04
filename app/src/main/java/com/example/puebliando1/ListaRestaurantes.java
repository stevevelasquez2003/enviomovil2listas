package com.example.puebliando1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.puebliando1.moldes.MoldeRestaurantes;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;


import adaptadores.AdaptadorRestaurantes;

public class ListaRestaurantes extends AppCompatActivity {
    ArrayList<MoldeRestaurantes> listaRestaurantes = new ArrayList<>();
    RecyclerView recyclerView;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);

        recyclerView = findViewById(R.id.listadinamicarestaurantes);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));

        db.collection("restaurantes")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                String nombreRestaurante=document.getString("nombre");
                                String rangoPrecio =document.getString("precio");
                                String telefonoRestaurante = document.getString("telefono");
                                String platoRecomendado = document.getString("plato recomendado");

                                Toast.makeText(ListaRestaurantes.this, nombreRestaurante, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaRestaurantes.this, rangoPrecio, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaRestaurantes.this, telefonoRestaurante, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaRestaurantes.this, platoRecomendado, Toast.LENGTH_SHORT).show();


                            }
                        } else {

                        }
                    }
                });

        llenarListaConDatos();
        AdaptadorRestaurantes adaptadorRestaurantes = new AdaptadorRestaurantes(listaRestaurantes);
        recyclerView.setAdapter(adaptadorRestaurantes);
    }

    private void llenarListaConDatos() {
        listaRestaurantes.add(new MoldeRestaurantes("Al Carbón Parrilla Bar",R.drawable.restauranteuno,"325614495","$150000 COP","SOLOMITO ","exelente servicio y comida de exelente calidad","5.0",R.drawable.listarestauranteuno));
        listaRestaurantes.add(new MoldeRestaurantes("Casa de Cielo",R.drawable.restaurantedos,"312458475","$250000 COP","MARISCOS","exelente servicio y comida de exelente calidad","4.0",R.drawable.listarestaurantedos));
        listaRestaurantes.add(new MoldeRestaurantes("Placido Gourmet",R.drawable.restaurantetres,"215463248","$190000 COP","SALMON","exelente servicio y comida de exelente calidad","4.5",R.drawable.listarestaurantetres));
        listaRestaurantes.add(new MoldeRestaurantes("La Fiesta Espresso",R.drawable.restaurantecuatro,"332625234"," $155000 COP ","SUSHI","exelente servicio y comida de exelente calidad","3.0",R.drawable.listarestauranteuno));
        listaRestaurantes.add(new MoldeRestaurantes("Le Gros Luxe",R.drawable.restaurantecinco,"315425214","185000","TRUCHA ","exelente servicio y comida de exelente calidad","3.5",R.drawable.listarestaurantedos));
        listaRestaurantes.add(new MoldeRestaurantes("Bella Grande Restaurant",R.drawable.restauranteseis,"214265324","$150000 COP","Casuela de mariscos","exelente servicio y comida de exelente calidad","5.0",R.drawable.listarestaurantetres));


    }
}
