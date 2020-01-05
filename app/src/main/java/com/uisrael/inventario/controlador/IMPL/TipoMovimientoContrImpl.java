/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador.IMPL;

import com.uisrael.inventarioproyecto.controlador.ITipoMovimientoController;
import com.uisrael.inventarioproyecto.modelo.Dao.Impl.TipoMovimientoDaoImpl;
import com.uisrael.inventarioproyecto.modelo.Entidades.TipoMovimiento;
import com.uisrael.inventarioproyecto.modelo.ITipoMovimientoDao;

 


import java.util.List;

/**
 *
 * @author JAVIER
 */
public class TipoMovimientoContrImpl implements ITipoMovimientoController{

    
    
    @Override
    public void ingresar(TipoMovimiento m) {
        ITipoMovimientoDao idao= new TipoMovimientoDaoImpl();
        idao.ingresar(m);
    }

    @Override
    public TipoMovimiento actualizar(TipoMovimiento m) {
        ITipoMovimientoDao idao= new TipoMovimientoDaoImpl();
        return  idao.actualizar(m);
    }

    @Override
    public void eliminar(TipoMovimiento m) {
        ITipoMovimientoDao idao= new TipoMovimientoDaoImpl();
        idao.eliminar(m);
    }

    @Override
    public List<TipoMovimiento> listar() {
        ITipoMovimientoDao idao= new TipoMovimientoDaoImpl(TipoMovimiento.class);
        return idao.listar();
    }

    @Override
    public TipoMovimiento buscarPorid(int id) {
        ITipoMovimientoDao idao= new TipoMovimientoDaoImpl();
        return idao.buscarPorid(id);
    }
    
    @Override
    public TipoMovimiento buscarPorName(String name) {
        ITipoMovimientoDao idao= new TipoMovimientoDaoImpl();
        return idao.buscarPorName(name);
    }
}
 