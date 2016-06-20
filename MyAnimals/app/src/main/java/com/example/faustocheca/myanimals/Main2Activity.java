package com.example.faustocheca.myanimals;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSpinner;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    AppCompatSpinner spinner;
    Context context;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        // configurar el spinner con tres categorías: gatos, perros, gatos y perros
        // al elegir una categoría, poner en el spinner el nombre de esa categoría

        ArrayList <String>opcionesSpinner = new ArrayList<>();
        opcionesSpinner.add(" ");
        opcionesSpinner.add("Perros");
        opcionesSpinner.add("Gatos");
        opcionesSpinner.add("Perros y Gatos");

        spinner = (AppCompatSpinner) findViewById(R.id.spinner);

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(
                this,android.R.layout.simple_spinner_dropdown_item,opcionesSpinner);

        spinner.setAdapter(adapter);


    }

    // si se clicka el botón "search" > función "search"
    // recoger la categoría seleccionada en el spinner por ejemplo perros
    // crear y abrir la base de datos,
    // carga datos para que haya algo
    // y pedirle la primera foto de esa categoría
    // (las lee de drawable)




    // si se clicka el botón "Next" >  función "next"
    // pedir a la BdeDatos la siguiente foto de esa categoría






    // si se clicka el botón "previous"  lanzar la función "previous"
    // pedir a la BdeDatos la foto anterior de esa categoría





}
