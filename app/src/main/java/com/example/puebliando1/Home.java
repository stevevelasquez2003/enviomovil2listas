package com.example.puebliando1;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Home extends AppCompatActivity {

    //ZONA DE LOS ATRIBUTOS
    Button botonHoteles;
    Button botonRestaurantes;
    Button botonTurismo;

    TextView nombreCliente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate  (savedInstanceState);
        setContentView(R.layout.activity_home);

        botonHoteles=findViewById(R.id.botonhoteles);
        botonRestaurantes=findViewById(R.id.botonrestaurantes);
        botonTurismo=findViewById(R.id.botonsitiosturisticos);
        nombreCliente=findViewById(R.id.cliente);
        //uniendo el texto putextra con el textview



        String nombre = getIntent().getStringExtra("nombre");

        //detectando eventos

        nombreCliente.setText(nombre);
        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenthotel = new Intent(Home.this,HotelesHome.class);
                startActivity(intenthotel);
            }
        });

        botonRestaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentrest = new Intent(Home.this,Restaurantes.class);
                startActivity(intentrest);
            }
        });

        botonTurismo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenturismo = new Intent(Home.this,Sitios.class);
                startActivity(intenturismo);            }
        });



    }

    public void cambiarIdioma(String idioma){

        //configurara el lenguaje del telefono
        Locale lenguaje= new Locale(idioma);
        Locale.setDefault(lenguaje);

        //configuramos globalmente el telefono
        Configuration configuracionTelefono=getResources().getConfiguration();
        configuracionTelefono.locale=lenguaje;
        //ejecutamos la configuracion
        getBaseContext().getResources().updateConfiguration(configuracionTelefono,getBaseContext().getResources().getDisplayMetrics());
    }

    public boolean onCreateOptionsMenu(Menu menujava){
        getMenuInflater().inflate(R.menu.menu,menujava);
        return true;

    }
    public boolean onOptionsItemSelected(MenuItem item){
    int itemseleccionado= item.getItemId();
    switch (itemseleccionado){
        case(R.id.opcion1):
            this.cambiarIdioma("en");
            Intent intentIngles=new Intent(Home.this, Home.class);
            startActivity(intentIngles);
            break;
        case (R.id.opcion2) :
            this.cambiarIdioma("es");
            Intent intentEspanol=new Intent(Home.this, Home.class);
            startActivity(intentEspanol);
            break;
        case (R.id.opcion3) :
            this.cambiarIdioma("it");
            Intent intentItaliano=new Intent(Home.this, Home.class);
            startActivity(intentItaliano);
            break;
        case (R.id.opcion4) :

            Intent intent = new Intent(Home.this,Acerca.class);
            startActivity(intent);
            break;


    }
return super.onOptionsItemSelected(item);
    }
public void cambiaridioma(String idioma){

}
}