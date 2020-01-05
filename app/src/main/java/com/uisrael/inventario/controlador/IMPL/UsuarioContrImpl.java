/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador.IMPL;

import com.uisrael.inventarioproyecto.controlador.IUsuarioController;
import com.uisrael.inventarioproyecto.modelo.Dao.Impl.UsuarioDaoImpl;
import com.uisrael.inventarioproyecto.modelo.Entidades.Usuario;
import com.uisrael.inventarioproyecto.modelo.IUsuarioDao;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public class UsuarioContrImpl implements IUsuarioController{

    @Override
    public void ingresar(Usuario m) {
        IUsuarioDao idao= new UsuarioDaoImpl();
        idao.ingresar(m);
    }

    @Override
    public Usuario actualizar(Usuario m) {
        IUsuarioDao idao= new UsuarioDaoImpl();
        return  idao.actualizar(m);
    }

    @Override
    public void eliminar(Usuario m) {
        IUsuarioDao idao= new UsuarioDaoImpl();
        idao.eliminar(m);
    }

    @Override
    public List<Usuario> listar() {
        IUsuarioDao idao= new UsuarioDaoImpl(Usuario.class);
        return idao.listar();
    }

    @Override
    public Usuario buscarPorid(int id) {
        IUsuarioDao idao= new UsuarioDaoImpl();
        return idao.buscarPorid(id);
    }

    @Override
    public Usuario obtenerPorIdentificacion(long identificacion, int rol) {
        IUsuarioDao idao= new UsuarioDaoImpl();
        return idao.obtenerPorIdentificacion(identificacion, rol);
    }
    
}
