/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador.IMPL;

import com.uisrael.inventarioproyecto.controlador.IClienteController;
import com.uisrael.inventarioproyecto.modelo.Dao.Impl.ClienteDaoImpl;
import com.uisrael.inventarioproyecto.modelo.Entidades.Cliente;
import com.uisrael.inventarioproyecto.modelo.IClienteDao;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public class ClienteContrImpl implements IClienteController{

    @Override
    public void ingresar(Cliente m) {
        IClienteDao idao= new ClienteDaoImpl();
        idao.ingresar(m);
    }

    @Override
    public Cliente actualizar(Cliente m) {
        IClienteDao idao= new ClienteDaoImpl();
        return  idao.actualizar(m);
    }

    @Override
    public void eliminar(Cliente m) {
        IClienteDao idao= new ClienteDaoImpl();
        idao.eliminar(m);
    }

    @Override
    public List<Cliente> listar() {
        IClienteDao idao= new ClienteDaoImpl(Cliente.class);
        return idao.listar();
    }

    @Override
    public Cliente buscarPorid(int id) {
        IClienteDao idao= new ClienteDaoImpl();
        return idao.buscarPorid(id);
    }
    
}
