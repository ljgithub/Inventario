package com.uisrael.inventario;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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
import java.sql.Statement;

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



    @SuppressLint("WrongThread")
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


        /**
         *  Inicializamos conexión con base de datos
         *
         */
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeConnection(v);
                try {
                    ejecutarPeticion();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    private void ejecutarPeticion() throws SQLException {
        String statement = "insert into zona (idzona, descripcion, estadozona) values (6,'Bodega Norte-Carcelen','1')";
        Connection conn = DriverManager.getConnection("jdbc:postgresql://35.192.200.171:5432/inventarioUisrael","postgres","postgres");

        Statement st = conn.createStatement();
        st.execute(statement);
    }

    public boolean makeConnection(View v){
        boolean response;
        try {
            ConnectionsBD con = new ConnectionsBD();
            con.doInBackground();
            Toast.makeText(getApplicationContext(), "Conexión Establecida", Toast.LENGTH_LONG).show();
            response = true;
        }catch (Exception ex){
            Toast.makeText(getApplicationContext(), "Falló al establecer la conexión", Toast.LENGTH_LONG).show();
            response = false;
        }
        return response;
    }
}
