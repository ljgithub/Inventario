/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador.IMPL;

import com.uisrael.inventarioproyecto.controlador.IZonaController;
import com.uisrael.inventarioproyecto.modelo.Dao.Impl.ZonaDaoImpl;
import com.uisrael.inventarioproyecto.modelo.Entidades.Zona;


import java.util.List;
import com.uisrael.inventarioproyecto.modelo.IZonaDao;

/**
 *
 * @author JAVIER
 */
public class ZonaContrImpl implements IZonaController{

    @Override
    public void ingresar(Zona m) {
        IZonaDao idao= new ZonaDaoImpl();
        idao.ingresar(m);
    }

    @Override
    public Zona actualizar(Zona m) {
        IZonaDao idao= new ZonaDaoImpl();
        return  idao.actualizar(m);
    }

    @Override
    public void eliminar(Zona m) {
        IZonaDao idao= new ZonaDaoImpl();
        idao.eliminar(m);
    }

    @Override
    public List<Zona> listar() {
        IZonaDao idao= new ZonaDaoImpl(Zona.class);
        return idao.listar();
    }

    @Override
    public Zona buscarPorid(int id) {
        IZonaDao idao= new ZonaDaoImpl();
        return idao.buscarPorid(id);
    }
    
}
