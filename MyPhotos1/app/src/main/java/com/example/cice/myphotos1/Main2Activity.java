package com.example.cice.myphotos1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ImageView imageView;
    Button buttonOK, buttonOUT;
    ArrayList<Integer> cuadrosIds;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cuadrosIds = new ArrayList<>();

        cuadrosIds.add(R.drawable.retrato_juan);
        cuadrosIds.add(R.drawable.retrato_maria);
        cuadrosIds.add(R.drawable.retrato_pereda);
        cuadrosIds.add(R.drawable.retrato_thomas);
        cuadrosIds.add(R.drawable.retrato_velarde);
        cuadrosIds.add(R.drawable.retrato_fausto);
        cuadrosIds.add(R.drawable.retrato_fuentes);

        imageView = (ImageView) findViewById(R.id.image_view);

        int index=0;


        imageView.setImageDrawable(getDrawable(cuadrosIds.get(0)));






        // habrá foto1...foto4 en Drawable y en un array en Main2
        // onCreate cargar foto1 en imageView
        // Botón Out carga foto2.. cada vez carga la siguiente. Después de foto4 se repite
        // Ok sale un mensaje ¡¡Esta me gusta¡¡





    }
    int index = 0;

    public void funcion_change(View v){

        index ++;
        if (index > 6) {
            index = 0;
        }
        imageView.setImageDrawable(getDrawable(cuadrosIds.get(index)));
    }



    public void funcion_ok(View v){


    }



}
