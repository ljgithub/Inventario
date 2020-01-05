/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Dao.Impl;

import com.uisrael.inventarioproyecto.controlador.IMPL.*;
import com.uisrael.inventarioproyecto.controlador.IUnidadMedidaController;
import com.uisrael.inventarioproyecto.modelo.Entidades.UnidadMedida;
import com.uisrael.inventarioproyecto.modelo.IUnidadMedidaDao;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author JAVIER
 */
public class UnidadMedidaDaoImpl extends GenericaDaoImpl<UnidadMedida> implements IUnidadMedidaDao{

    public UnidadMedidaDaoImpl() {
    }

    public UnidadMedidaDaoImpl(Class<UnidadMedida> entityClass) {
        super(entityClass);
    }

    
    
    
    @Override
    public void ingresar(UnidadMedida m) {
        this.create(m);
    }

    @Override
    public UnidadMedida actualizar(UnidadMedida m) {
        return this.update(m);
    }

    @Override
    public void eliminar(UnidadMedida m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UnidadMedida> listar() {
        return this.findAll();
    }

    

    @Override
    public UnidadMedida buscarPorid(int id) {
          //1.-  Generamos la consulta en un string
        String sentencia = "Select c from UnidadMedida c where c.idMedida = " + id;

        //2.- Instanciamos un TypedQuery
        TypedQuery<UnidadMedida> typed = this.entityManager.createQuery(sentencia, UnidadMedida.class);

        UnidadMedida resultado = typed.getSingleResult();

        return resultado;
    }
    
}
