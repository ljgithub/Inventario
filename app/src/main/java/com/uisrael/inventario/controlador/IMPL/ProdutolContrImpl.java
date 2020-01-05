/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador.IMPL;

import com.uisrael.inventarioproyecto.controlador.IProductoController;
import com.uisrael.inventarioproyecto.modelo.Dao.Impl.ProductoDaoImpl;
import com.uisrael.inventarioproyecto.modelo.Entidades.Producto;
import com.uisrael.inventarioproyecto.modelo.IProductoDao;




import java.util.List;

/**
 *
 * @author JAVIER
 */
public class ProdutolContrImpl implements IProductoController{

    
    
    @Override
    public void ingresar(Producto m) {
        IProductoDao idao= new ProductoDaoImpl();
        idao.ingresar(m);
    }

    @Override
    public Producto actualizar(Producto m) {
        IProductoDao idao= new ProductoDaoImpl();
        return  idao.actualizar(m);
    }

    @Override
    public void eliminar(Producto m) {
        IProductoDao idao= new ProductoDaoImpl();
        idao.eliminar(m);
    }

    @Override
    public List<Producto> listar() {
        IProductoDao idao= new ProductoDaoImpl(Producto.class);
        return idao.listar();
    }

    @Override
    public Producto buscarPorid(int id) {
        IProductoDao idao= new ProductoDaoImpl();
        return idao.buscarPorid(id);
    }

    @Override
    public List<Producto> buscarProductosPorIdProveedor(int idProducto) {
        IProductoDao idao= new ProductoDaoImpl();
        return idao.buscarProductosPorIdProveedor(idProducto);
    }
    
}
