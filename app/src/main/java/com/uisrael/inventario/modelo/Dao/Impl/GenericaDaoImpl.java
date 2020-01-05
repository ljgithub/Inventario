/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventario.modelo.Dao.Impl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JAVIER
 */
public class GenericaDaoImpl<T> /*extends AsyncTask<String, Void, Void> implements IGenericaDao<T>*/ {

    private Class<T> entityClass;

    public GenericaDaoImpl() throws SQLException {
        //entityManager = emf.createEntityManager();

        conectar();
        }

    public Connection conectar() throws SQLException {
        Connection conn = DriverManager.getConnection("jdbc:postgresql://35.192.200.171:5432/inventarioUisrael","postgres","postgres");
        return  conn;
    }

    /*
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
    }*/
/*
    public GenericaDaoImpl(Class<T> entityClass) {
        this.entityClass = entityClass;
        entityManager = emf.createEntityManager();
    }

    //Definimos el CRUD
    @Override
    public T create(T t) {
        this.entityManager.persist(t);
        commit();
        return t;
    }

    @Override
    public T read(Object id) {
        return this.entityManager.find(entityClass, id);
    }

    @Override
    public T update(T t) {
        this.entityManager.merge(t);
        commit();
        return t;
    }

    @Override
    public void delete(T t) {
        t = this.entityManager.merge(t);
        this.entityManager.remove(t);
    }

    @Override
    //Definir los parámetros
    public void beginTransaction() {
        if (!entityManager.getTransaction().isActive()) {
            entityManager = emf.createEntityManager();
        }

        entityManager.getTransaction().begin();
    }

    @Override
    public void commit() {
        if (entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().commit();
        } else {
            entityManager.getTransaction().begin();
            commit();
        }

    }

    @Override
    public void rollback() {
        if (entityManager.getTransaction().isActive()) {
            entityManager.getTransaction().rollback();
        }
    }

    @Override
    public void closeTransaction() {
        entityManager.close();
    }

    @Override
    public void commitAndCloseTransaction() {
        commit();
        closeTransaction();
    }

    public void flush() {
        entityManager.flush();
    }

    @Override
    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = this.entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return this.entityManager.createQuery(cq).getResultList();
    }

    @Override
    public CriteriaBuilder getCriteriaBuilder() {
        return emf.getCriteriaBuilder();
    }

    */
    
}
