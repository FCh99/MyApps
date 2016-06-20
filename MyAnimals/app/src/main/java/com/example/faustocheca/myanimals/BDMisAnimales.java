package com.example.faustocheca.myanimals;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by faustocheca on 20/6/16.
 */
public class BDMisAnimales extends SQLiteOpenHelper{

    //1 tabla t_perrosYGatos
    // id, categoria, foto


    /*
    private static final String DB_NAME = "BDMisAnimales";
    private static final String TABLE_NAME = "perrosygatos";
    private static final String COL_ID = "id";
    private static final String COL_CATEGORY = "category";
    private static final String COL_FOTO = "foto";
    */





    private final String sqlCreacionTablaPerrosYGatos =
            "CREATE TABLE 'perrosygatos'('id' INTEGER PRIMARY KEY, 'category' TEXT, 'foto' TEXT)";


    public BDMisAnimales(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL(sqlCreacionTablaPerrosYGatos);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

        //En caso de que al constructor le pasemos un número de versión distinto a
        // la base de datos existente, este métdo es invocado. Esto sería necesario
        //cuando modificamos la estrucutura de la base de datos

        //Aquí, deberíamos
        // 1 - Extraer los datos de la vieja versión y copiarlos a la nueva instancia
        // 2 - Crear la nueva versión
        // 3 - Cargar los datos en las tablas de la nueva versión

    }

    private void cerrarBaseDatos (SQLiteDatabase database)
    {
        database.close();
    }


    //<<<<<<<<<<<<<<<<<<<<< por aquí qutar comentarios y revisar todo
    //<<<<<<<<<<<<<<<<<<<<<


/*

    public void insertarPersona (Persona persona)
    {

        SQLiteDatabase database = this.getWritableDatabase();
        database.execSQL("INSERT INTO PERSONA (id, nombre) VALUES ("+ persona.getId()+" , '"+ persona.getNombre()+"')");
        this.cerrarBaseDatos(database);

    }

    public void insertarCoche (Coche coche)
    {

        SQLiteDatabase database = this.getWritableDatabase();
        database.execSQL("INSERT INTO COCHE (modelo, idpersona) VALUES ('"+coche.getModelo()+"' , "+coche.getPersona().getId()+")");
        this.cerrarBaseDatos(database);
    }

    public Persona buscarPersona (String nombre)
    {
        Persona persona = null;
        int aux_id = -1;
        String nombre_aux = null;

        String consulta = "SELECT id, nombre FROM PERSONA WHERE nombre LIKE %"+nombre+"%;";


        SQLiteDatabase basedatos = this.getReadableDatabase();
        Cursor cursor = basedatos.rawQuery(consulta, null);


        if( cursor != null || cursor.getCount() <=0)
        {
            cursor.moveToFirst();

            aux_id = cursor.getInt(0); //la posicion primera, el id
            nombre_aux = cursor.getString(1); //la posicion segunda, el id
            persona = new Persona(aux_id, nombre_aux);

            cursor.close();
        }

        this.cerrarBaseDatos(basedatos);

        return persona;
    }



    public List<Coche> buscarCochesPersona (Persona persona)
    {
        List<Coche> lista_coches = null;
        Coche coche = null;
        int aux_id = -1;
        String modelo = null;


        String consulta = "SELECT modelo FROM COCHE WHERE idpersona ="+persona.getId();

        SQLiteDatabase basedatos = this.getReadableDatabase();
        Cursor cursor = basedatos.rawQuery(consulta, null);


        if( cursor != null || cursor.getCount() <=0)
        {
            cursor.moveToFirst();
            lista_coches = new ArrayList<Coche>(cursor.getCount());

            do
            {

                modelo = cursor.getString(0); //la posicion primera, el id
                coche = new Coche(modelo);
                lista_coches.add(coche);

            }while (cursor.moveToNext());

            cursor.close();
        }

        this.cerrarBaseDatos(basedatos);
        return lista_coches;
    }


*/






}
