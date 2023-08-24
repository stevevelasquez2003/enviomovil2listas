package com.example.puebliando1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
//atributos de la clase
    EditText cajaNombreUsuario;
    EditText cajaContrasena;
Button botonIngreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        cajaNombreUsuario= findViewById(R.id.usuario);
        cajaContrasena= findViewById(R.id.contraseña);
        botonIngreso=findViewById(R.id.botonIngresar);

        botonIngreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreUsuario=cajaNombreUsuario.getText().toString();
                String passwordUsuario=cajaContrasena.getText().toString();
                Intent intent=new Intent(Login.this,Home.class);

                intent.putExtra("nombre",nombreUsuario);
                intent.putExtra("password",passwordUsuario);
startActivity(intent);
            }
        });




        //capturando dato de las cajas
        String nombreUsuario=cajaNombreUsuario.getText().toString();
        String passwordUsuario=cajaContrasena.getText().toString();
        Toast.makeText(this,"su nombre es :  "+ nombreUsuario,Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "su contraseña es : "+ passwordUsuario, Toast.LENGTH_SHORT).show();







    }
}