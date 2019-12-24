package com.uisrael.inventario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
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

    String baseDatos = "kcatkipg";

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
        //boolean res = conectarAMySql();


        AsyncTask.execute(new Runnable() {
            @Override
            public void run() {
                String ip = "rajje.db.elephantsql.com";
                String puerto = "3306";
                String user= "kcatkipg";
                String password = "rBJJrCOygZBKni0U74j6B5w9Xvbhr9pv";

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
            }
        });


        return true;
    }

    public boolean conectarAMySql() {

        String ip = "rajje.db.elephantsql.com";
        String puerto = "3306";
        String user= "kcatkipg";
        String password = "rBJJrCOygZBKni0U74j6B5w9Xvbhr9pv";

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
