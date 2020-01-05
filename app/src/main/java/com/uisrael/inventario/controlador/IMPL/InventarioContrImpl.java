/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador.IMPL;

import com.uisrael.inventarioproyecto.controlador.IInventarioController;
import com.uisrael.inventarioproyecto.modelo.Dao.Impl.InventarioDaoImpl;
import com.uisrael.inventarioproyecto.modelo.Entidades.Inventario;


import java.util.List;
import com.uisrael.inventarioproyecto.modelo.IInventarioDao;

/**
 *
 * @author JAVIER
 */
public class InventarioContrImpl implements IInventarioController{

    @Override
    public void ingresar(Inventario m) {
        IInventarioDao idao= new InventarioDaoImpl();
        idao.ingresar(m);
    }

    @Override
    public Inventario actualizar(Inventario m) {
        IInventarioDao idao= new InventarioDaoImpl();
        return  idao.actualizar(m);
    }

    @Override
    public void eliminar(Inventario m) {
        IInventarioDao idao= new InventarioDaoImpl();
        idao.eliminar(m);
    }

    @Override
    public List<Inventario> listar() {
        IInventarioDao idao= new InventarioDaoImpl(Inventario.class);
        return idao.listar();
    }

    @Override
    public Inventario buscarPorid(int id) {
        IInventarioDao idao= new InventarioDaoImpl();
        return idao.buscarPorid(id);
    }

    @Override
    public List<Inventario> consultarStock() {
        IInventarioDao idao= new InventarioDaoImpl();
        return idao.consultarStock();
    }
    
}
