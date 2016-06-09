package com.example.cice.myphotos1;

import android.app.Activity;
import android.content.Intent;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Dibujar la actividad
        setContentView(R.layout.activity_main);


    }

    //Detectar el evento y tomar acción

    public void traerFotos(View v) {


        EditText nombre = (EditText) findViewById(R.id.edit_nombre);
        EditText password = (EditText) findViewById(R.id.edit_password);

        String name = nombre.getText().toString();
        String pass = password.getText().toString();






        if ((name.equals("r")) && (pass.equals("r"))) {

            // NO funciona ==

            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);



        }else {

            int count =3;
            count --;
            Toast.makeText(MainActivity.this, "Te quedam "+count+" intentos", Toast.LENGTH_SHORT).show();


            if (count==0){
                this.finish();

            }



        }




    }

}
