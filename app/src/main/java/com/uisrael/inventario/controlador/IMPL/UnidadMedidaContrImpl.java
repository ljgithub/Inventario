/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador.IMPL;

import com.uisrael.inventarioproyecto.controlador.IPedidoController;
import com.uisrael.inventarioproyecto.controlador.IUnidadMedidaController;
import com.uisrael.inventarioproyecto.modelo.Dao.Impl.UnidadMedidaDaoImpl;
import com.uisrael.inventarioproyecto.modelo.Entidades.UnidadMedida;


import com.uisrael.inventarioproyecto.modelo.IUnidadMedidaDao;

import java.util.List;

/**
 *
 * @author JAVIER
 */
public class UnidadMedidaContrImpl implements IUnidadMedidaController{

    @Override
    public void ingresar(UnidadMedida m) {
        IUnidadMedidaDao idao= new UnidadMedidaDaoImpl();
        idao.ingresar(m);
    }

    @Override
    public UnidadMedida actualizar(UnidadMedida m) {
        IUnidadMedidaDao idao= new UnidadMedidaDaoImpl();
        return  idao.actualizar(m);
    }

    @Override
    public void eliminar(UnidadMedida m) {
        IUnidadMedidaDao idao= new UnidadMedidaDaoImpl();
        idao.eliminar(m);
    }

    @Override
    public List<UnidadMedida> listar() {
        IUnidadMedidaDao idao= new UnidadMedidaDaoImpl(UnidadMedida.class);
        return idao.listar();
    }

    @Override
    public UnidadMedida buscarPorid(int id) {
        IUnidadMedidaDao idao= new UnidadMedidaDaoImpl();
        return idao.buscarPorid(id);
    }
    
}
