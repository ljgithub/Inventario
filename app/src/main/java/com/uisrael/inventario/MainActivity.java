package com.uisrael.inventario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Parametros para conexión con base de datos
 *
 */

import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.SQLException;

public class MainActivity extends AppCompatActivity{



    Button guardar = null;
    EditText nombreProducto = null;
    EditText marcaProducto = null;
    EditText proveedorProducto = null;
    EditText costoProducto = null;

    String nombreProd = "";
    String marcaProd = "";
    String proveedorProd = "";
    String costoProd = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        guardar = findViewById(R.id.btnGuardar);
        nombreProducto = findViewById(R.id.edtNombre);
        marcaProducto = findViewById(R.id.edtMarca);
        proveedorProducto= findViewById(R.id.edtProveedor);
        costoProducto = findViewById(R.id.edtCosto);

        nombreProd = nombreProducto.getText().toString();
        marcaProd = marcaProducto.getText().toString();
        proveedorProd = proveedorProducto.getText().toString();
        costoProd = costoProducto.getText().toString();


        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarProducto(v);
            }
        });

    }

    public boolean guardarProducto(View v){
        conectarAMySql();

        return true;
    }

    boolean conectarAMySql() {

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        String ip = "rajje.db.elephantsql.com";
        String puerto = "5432";
        String user= "kmkcmfcd";
        String password = "I5u5omGjZUqctQ3VB6yPAn7poOnw92l-";

        String baseDatos = "kmkcmfcd";

        boolean estadoConeccion = false;
        String driver = "org.postgresql.Driver";

        String urlMySQL = "jdbc:postgresql://" + ip + ":" + puerto + "/";

        Connection conexionMySql = null;

        try {
            Class.forName(driver).newInstance();
            conexionMySql = DriverManager.getConnection(urlMySQL + baseDatos  ,  user, password);

            if (!conexionMySql.isClosed()){
                estadoConeccion = true;
                Toast.makeText(getApplicationContext(), "Conexion Establecida", Toast.LENGTH_LONG).show();
            }
        }catch (Exception ex){
            Toast.makeText(getApplicationContext(), "No se pudo establecer la conexión!!!", Toast.LENGTH_LONG).show();
        }

        return  estadoConeccion;

    }
}
