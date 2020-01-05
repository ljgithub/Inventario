/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Dao.Impl;

import com.uisrael.inventarioproyecto.controlador.IMPL.*;
import com.uisrael.inventarioproyecto.modelo.Entidades.DetallePedido;
import com.uisrael.inventarioproyecto.modelo.Entidades.Inventario;
import java.util.List;
import javax.persistence.TypedQuery;
import com.uisrael.inventarioproyecto.modelo.IInventarioDao;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author JAVIER
 */
public class InventarioDaoImpl extends GenericaDaoImpl<Inventario> implements IInventarioDao {

    public InventarioDaoImpl() {
    }

    public InventarioDaoImpl(Class<Inventario> entityClass) {
        super(entityClass);
    }

    @Override
    public void ingresar(Inventario m) {
        this.create(m);
    }

    @Override
    public Inventario actualizar(Inventario m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Inventario m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Inventario> listar() {
        return this.findAll();
    }

    @Override
    public Inventario buscarPorid(int id) {
        String sentencia = "select t from Inventario t where t.idInventario = " + id;

        TypedQuery<Inventario> typed = this.entityManager.createQuery(sentencia, Inventario.class);

        Inventario resultado = typed.getSingleResult();

        return resultado;
    }

    @Override
    public List<Inventario> consultarStock() {
       return null;
    }

}
