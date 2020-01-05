/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador.IMPL;

import com.uisrael.inventarioproyecto.controlador.IRolController;
import com.uisrael.inventarioproyecto.modelo.Dao.Impl.RolDaoImpl;
import com.uisrael.inventarioproyecto.modelo.Entidades.Rol;
import com.uisrael.inventarioproyecto.modelo.IRolDao;




import java.util.List;

/**
 *
 * @author JAVIER
 */
public class RolContrImpl implements IRolController{

    
    
    @Override
    public void ingresar(Rol m) {
        IRolDao idao= new RolDaoImpl();
        idao.ingresar(m);
    }

    @Override
    public Rol actualizar(Rol m) {
        IRolDao idao= new RolDaoImpl();
        return  idao.actualizar(m);
    }

    @Override
    public void eliminar(Rol m) {
        IRolDao idao= new RolDaoImpl();
        idao.eliminar(m);
    }

    @Override
    public List<Rol> listar() {
        IRolDao idao= new RolDaoImpl(Rol.class);
        return idao.listar();
    }

    @Override
    public Rol buscarPorid(int id) {
        IRolDao idao= new RolDaoImpl();
        return idao.buscarPorid(id);
    }
    
}
