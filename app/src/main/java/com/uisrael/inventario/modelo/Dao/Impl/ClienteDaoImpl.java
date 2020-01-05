/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventario.modelo.Dao.Impl;

import com.uisrael.inventarioproyecto.controlador.IMPL.*;
import com.uisrael.inventarioproyecto.controlador.IClienteController;
import com.uisrael.inventarioproyecto.modelo.Entidades.Cliente;
import com.uisrael.inventarioproyecto.modelo.IClienteDao;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author JAVIER
 */
public class ClienteDaoImpl extends GenericaDaoImpl<Cliente> implements IClienteDao{

    public ClienteDaoImpl() throws SQLException {
        super();
    }

    public ClienteDaoImpl(Class<Cliente> entityClass) {
        super(entityClass);
    }

    
    
    @Override
    public void ingresar(Cliente m) {
        this.create(m);
        System.out.println("Cliente Creada : " + m);
    }

    @Override
    public Cliente actualizar(Cliente m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Cliente m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> listar() {
        return this.findAll();
    }

    @Override
    public Cliente buscarPorid(int id) {
        String sentencia = "select t from Cliente t where t.idCliente = " +id;

        TypedQuery<Cliente> typed = this.entityManager.createQuery(sentencia, Cliente.class);
                
        Cliente resultado = typed.getSingleResult();
                        
        return resultado;
    }
    
}
