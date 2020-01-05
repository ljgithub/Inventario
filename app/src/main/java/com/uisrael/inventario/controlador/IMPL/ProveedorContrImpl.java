/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador.IMPL;

import com.uisrael.inventarioproyecto.controlador.IProveedorController;
import com.uisrael.inventarioproyecto.modelo.Dao.Impl.ProveedorDaoImpl;
import com.uisrael.inventarioproyecto.modelo.Entidades.Proveedor;
import com.uisrael.inventarioproyecto.modelo.IProveedorDao;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public class ProveedorContrImpl implements IProveedorController{

    @Override
    public void ingresar(Proveedor m) {
        try{
            IProveedorDao idao= new ProveedorDaoImpl();
        idao.ingresar(m);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }

    @Override
    public Proveedor actualizar(Proveedor m) {
        IProveedorDao idao= new ProveedorDaoImpl();
        return  idao.actualizar(m);
    }

    @Override
    public void eliminar(Proveedor m) {
        IProveedorDao idao= new ProveedorDaoImpl();
        idao.eliminar(m);
    }

    @Override
    public List<Proveedor> listar() {
        IProveedorDao idao= new ProveedorDaoImpl(Proveedor.class);
        return idao.listar();
    }

    @Override
    public Proveedor buscarPorid(int id) {
        IProveedorDao idao= new ProveedorDaoImpl();
        return idao.buscarPorid(id);
    }
    
}
