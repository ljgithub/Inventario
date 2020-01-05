/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador.IMPL;

import com.uisrael.inventarioproyecto.controlador.IPersonaController;
import com.uisrael.inventarioproyecto.modelo.Dao.Impl.PersonaDaoImpl;
import com.uisrael.inventarioproyecto.modelo.Entidades.Usuario;
import com.uisrael.inventarioproyecto.modelo.IPersonaDao;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public class PersonaContrImpl implements IPersonaController{

    @Override
    public void ingresar(Usuario m) {
        IPersonaDao idao= new PersonaDaoImpl();
        idao.ingresar(m);
    }

    @Override
    public Usuario actualizar(Usuario m) {
        IPersonaDao idao= new PersonaDaoImpl();
        return  idao.actualizar(m);
    }

    @Override
    public void eliminar(Usuario m) {
        IPersonaDao idao= new PersonaDaoImpl();
        idao.eliminar(m);
    }

    @Override
    public List<Usuario> listar() {
        IPersonaDao idao= new PersonaDaoImpl(Usuario.class);
        return idao.listar();
    }

    @Override
    public Usuario buscarPorid(int id) {
        IPersonaDao idao= new PersonaDaoImpl();
        return idao.buscarPorid(id);
    }
    
}
