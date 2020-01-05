/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Dao.Impl;

import com.uisrael.inventarioproyecto.controlador.IMPL.*;

import com.uisrael.inventarioproyecto.modelo.Entidades.Producto;
import com.uisrael.inventarioproyecto.modelo.IProductoDao;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author JAVIER
 */
public class ProductoDaoImpl extends GenericaDaoImpl<Producto> implements IProductoDao {

    public ProductoDaoImpl() {
    }

    public ProductoDaoImpl(Class<Producto> entityClass) {
        super(entityClass);
    }

    @Override
    public void ingresar(Producto m) {
        this.create(m);
    }

    @Override
    public Producto actualizar(Producto m) {
        return this.update(m);
    }

    @Override
    public void eliminar(Producto m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> listar() {
        return this.findAll();
    }

    @Override
    public Producto buscarPorid(int id) {

        String sentencia = "Select c from Producto c where c.idProducto = " + id;
        TypedQuery<Producto> typed = this.entityManager.createQuery(sentencia, Producto.class);
        Producto producto = typed.getSingleResult();
        return producto;
    }

    @Override
    public List<Producto> buscarProductosPorIdProveedor(int idProveedor) {
        String sentencia = "Select c from Producto c where c.proveedor.idProveedor = " + idProveedor;
        TypedQuery<Producto> typed = this.entityManager.createQuery(sentencia, Producto.class);
        List<Producto> productos = typed.getResultList();
        return productos;
    }

}
