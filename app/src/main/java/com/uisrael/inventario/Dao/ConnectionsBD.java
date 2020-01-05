package com.uisrael.inventario.Dao;

import android.os.AsyncTask;
import android.os.StrictMode;

import com.uisrael.inventario.MainActivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionsBD extends AsyncTask<String, Void, Void> {

    @Override
    protected Void doInBackground(String... strings) {
        String ip = "35.192.200.171";
        String puerto = "5432";
        String user= "postgres";
        String password = "postgres";
        String baseDatos = "inventarioUisrael";

        boolean estadoConeccion = false;
        String driver = "org.postgresql.Driver";

        String urlMySQL = "jdbc:postgresql://" + ip + ":" + puerto + "/";

        Connection conexionMySql = null;
        MainActivity mainIn = new MainActivity();

            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);

        try {
            Class.forName(driver).newInstance();
            conexionMySql = DriverManager.getConnection(urlMySQL + baseDatos  ,  user, password);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
