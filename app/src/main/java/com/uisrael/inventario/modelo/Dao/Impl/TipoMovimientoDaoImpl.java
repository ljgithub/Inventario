/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Dao.Impl;

import com.uisrael.inventarioproyecto.controlador.IMPL.*;
import com.uisrael.inventarioproyecto.modelo.Entidades.TipoMovimiento;
import com.uisrael.inventarioproyecto.modelo.Entidades.UnidadMedida;
import com.uisrael.inventarioproyecto.modelo.ITipoMovimientoDao;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author JAVIER
 */
public class TipoMovimientoDaoImpl extends GenericaDaoImpl<TipoMovimiento> implements ITipoMovimientoDao{

    public TipoMovimientoDaoImpl() {
    }
       
    public TipoMovimientoDaoImpl(Class<TipoMovimiento> entityClass) {
        super(entityClass);
    }    
    
    @Override
    public void ingresar(TipoMovimiento m) {
        this.create(m);
    }

    @Override
    public TipoMovimiento actualizar(TipoMovimiento m) {
        return this.update(m);
    }

    @Override
    public void eliminar(TipoMovimiento m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoMovimiento> listar() {
        return this.findAll();
    }

    @Override
    public TipoMovimiento buscarPorid(int id) {
        //1.-  Generamos la consulta en un string
        String sentencia = "Select c from TipoMovimiento c where c.idMovimiento = " + id;

        //2.- Instanciamos un TypedQuery
        TypedQuery<TipoMovimiento> typed = this.entityManager.createQuery(sentencia, TipoMovimiento.class);

        TipoMovimiento resultado = typed.getSingleResult();

        return resultado;
    }

    @Override
    public TipoMovimiento buscarPorName(String name) {
        //1.-  Generamos la consulta en un string
        String sentencia = "Select c from TipoMovimiento c where c.nombreMovimiento = '" + name + "'";

        //2.- Instanciamos un TypedQuery
        TypedQuery<TipoMovimiento> typed = this.entityManager.createQuery(sentencia, TipoMovimiento.class);

        TipoMovimiento resultado = typed.getSingleResult();

        return resultado;
    }
    
}
