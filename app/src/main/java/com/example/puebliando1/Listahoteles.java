package com.example.puebliando1;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.puebliando1.moldes.Moldehotel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

import adaptadores.AdaptadorHoteles;

public class Listahoteles extends AppCompatActivity {
    ArrayList<Moldehotel> listaHoteles = new ArrayList<>();

    RecyclerView recyclerView;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listahoteles);

        recyclerView = findViewById(R.id.listadinamicahoteles);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        db.collection("hoteles")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                String nombreHotel=document.getString("nombre");
                                String precioHotel =document.getString("precio");
                                String telefonoHotel = document.getString("telefono");
                                String descripcionHotel = document.getString("descripcion");
                                Toast.makeText(Listahoteles.this, nombreHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(Listahoteles.this, precioHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(Listahoteles.this, telefonoHotel, Toast.LENGTH_SHORT).show();
                                Toast.makeText(Listahoteles.this, descripcionHotel, Toast.LENGTH_SHORT).show();

                            }
                        } else {

                        }
                    }
                });

        llenarListaConDatos();
        AdaptadorHoteles adaptadorHoteles = new AdaptadorHoteles(listaHoteles);
        recyclerView.setAdapter(adaptadorHoteles);
    }


    private void llenarListaConDatos() {
        listaHoteles.add(new Moldehotel("HOTEL LA PALMA","$155000","251648932",R.drawable.hoteluno,"hotel espectacular","3.0",R.drawable.hoteldos,R.drawable.hotellistatres));
        listaHoteles.add(new Moldehotel("HOTEL LA ROSA","$180000","342512654",R.drawable.hoteldos,"cavañas al aire libre","5.0",R.drawable.hotelcuatro,R.drawable.hotellistacuatro));
        listaHoteles.add(new Moldehotel("HOTEL LA LOMA","$185000","263514788",R.drawable.hoteltres,"hotel en las montañas","5.0",R.drawable.hoteluno,R.drawable.hotellistacinco));
        listaHoteles.add(new Moldehotel("HOTEL LA GLAUTIER","$190000","321625148",R.drawable.hotelcuatro,"hotel al lado de la represa","4.5",R.drawable.hotelcinco,R.drawable.hotellistaseis));
        listaHoteles.add(new Moldehotel("HOTEL LA EXTINTO","$195000","320625941",R.drawable.hotelcinco,"lujoso hotel al lado de el peñol","3.5",R.drawable.hoteltres,R.drawable.hotellistatres));
        listaHoteles.add(new Moldehotel("HOTEL LA INSTINTO","$300000","234451698",R.drawable.hotelseis,"hotel en la playa","4.0",R.drawable.hotelseis,R.drawable.hotellistacuatro));

    }
}