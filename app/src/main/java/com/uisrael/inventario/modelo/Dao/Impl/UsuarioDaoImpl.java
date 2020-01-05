/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Dao.Impl;

import com.uisrael.inventarioproyecto.controlador.IMPL.*;
import com.uisrael.inventarioproyecto.controlador.IUsuarioController;
import com.uisrael.inventarioproyecto.modelo.Entidades.Usuario;
import com.uisrael.inventarioproyecto.modelo.IUsuarioDao;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author JAVIER
 */
public class UsuarioDaoImpl extends GenericaDaoImpl<Usuario> implements IUsuarioDao{

    public UsuarioDaoImpl() {
    }

    public UsuarioDaoImpl(Class<Usuario> entityClass) {
        super(entityClass);
    }
    
    
    @Override
    public void ingresar(Usuario m) {
        this.create(m);
        System.out.println("Usuario Creada : " + m);
    }

    @Override
    public Usuario actualizar(Usuario m) {
        return this.update(m);
    }

    @Override
    public void eliminar(Usuario m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listar() {
        return this.findAll();
    }

    @Override
    public Usuario buscarPorid(int id) {
        String sentencia = "Select c from Usuario c where c.idUsuario = " + id;
        TypedQuery<Usuario> typed = this.entityManager.createQuery(sentencia, Usuario.class);
        Usuario usuario = typed.getSingleResult();        
        return usuario;
    }

    @Override
    public Usuario obtenerPorIdentificacion(long identificacion, int rol) {
        String sentencia = "Select c from Usuario c where c.identificacion = " + identificacion + " and c.rol.idRol = " + rol;
        TypedQuery<Usuario> typed = this.entityManager.createQuery(sentencia, Usuario.class);
        Usuario usuario = typed.getSingleResult();        
        return usuario;
    }
    
}
