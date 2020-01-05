/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Dao.Impl;

import com.uisrael.inventarioproyecto.controlador.IMPL.*;
import com.uisrael.inventarioproyecto.modelo.Entidades.Rol;
import com.uisrael.inventarioproyecto.modelo.IRolDao;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author JAVIER
 */
public class RolDaoImpl extends GenericaDaoImpl<Rol> implements IRolDao {

    public RolDaoImpl() {
    }

    public RolDaoImpl(Class<Rol> entityClass) {
        super(entityClass);
    }

    @Override
    public void ingresar(Rol m) {
        this.create(m);
    }

    @Override
    public Rol actualizar(Rol m) {
        return this.update(m);
    }

    @Override
    public void eliminar(Rol m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rol> listar() {
        return this.findAll();
    }

    @Override
    public Rol buscarPorid(int id) {
        String sentencia = "Select c from Rol c where c.idRol = " + id;
        TypedQuery<Rol> typed = this.entityManager.createQuery(sentencia, Rol.class);
        Rol rol = typed.getSingleResult();
        return rol;
    }

}
