/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Dao.Impl;

import com.uisrael.inventarioproyecto.controlador.IMPL.*;
import com.uisrael.inventarioproyecto.modelo.Entidades.Zona;
import java.util.List;
import javax.persistence.TypedQuery;
import com.uisrael.inventarioproyecto.modelo.IZonaDao;

/**
 *
 * @author JAVIER
 */
public class ZonaDaoImpl extends GenericaDaoImpl<Zona> implements IZonaDao{

    public ZonaDaoImpl() {
    }

    public ZonaDaoImpl(Class<Zona> entityClass) {
        super(entityClass);
    }

    
    
    @Override
    public void ingresar(Zona m) {
        this.create(m);
    }

    @Override
    public Zona actualizar(Zona m) {
        return this.update(m);
    }

    @Override
    public void eliminar(Zona m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Zona> listar() {
        return this.findAll();
    }

    @Override
    public Zona buscarPorid(int id) {
        String sentencia = "select t from Zona t where t.idZona = " +id;

        TypedQuery<Zona> typed = this.entityManager.createQuery(sentencia, Zona.class);
                
        Zona resultado = typed.getSingleResult();
                        
        return resultado;
    }
    
}
