package com.example.puebliando1;

import android.os.Bundle;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.puebliando1.moldes.Moldeturismo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

import adaptadores.AdaptadorSitios;

public class ListaSitiosTuristicos extends AppCompatActivity {
    ArrayList<Moldeturismo> listaturismo = new ArrayList<>();
    RecyclerView recyclerView;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios_turisticos);

        recyclerView = findViewById(R.id.listadinamicaturismo);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));

        db.collection("sitios turisticos")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                String nombreSitio=document.getString("nombre");
                                String nombreContacto = document.getString("nombre contacto");
                                String presioSitio =document.getString("precio");
                                String telefonoSitio = document.getString("telefono");
                                String comentario = document.getString("comentario");

                                Toast.makeText(ListaSitiosTuristicos.this, nombreSitio, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaSitiosTuristicos.this, nombreContacto, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaSitiosTuristicos.this, presioSitio, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaSitiosTuristicos.this, telefonoSitio, Toast.LENGTH_SHORT).show();
                                Toast.makeText(ListaSitiosTuristicos.this, comentario, Toast.LENGTH_SHORT).show();


                            }
                        } else {

                        }
                    }
                });



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
