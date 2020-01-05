/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador.IMPL;

import com.uisrael.inventarioproyecto.controlador.IPedidoController;
import com.uisrael.inventarioproyecto.modelo.Dao.Impl.PedidoDaoImpl;
import com.uisrael.inventarioproyecto.modelo.Entidades.Pedidos;


import com.uisrael.inventarioproyecto.modelo.IPedidoDao;

import java.util.List;

/**
 *
 * @author JAVIER
 */
public class PedidoContrImpl implements IPedidoController{

    @Override
    public void ingresar(Pedidos m) {
        IPedidoDao idao= new PedidoDaoImpl();
        idao.ingresar(m);
    }

    @Override
    public Pedidos actualizar(Pedidos m) {
        IPedidoDao idao= new PedidoDaoImpl();
        return  idao.actualizar(m);
    }

    @Override
    public void eliminar(Pedidos m) {
        IPedidoDao idao= new PedidoDaoImpl();
        idao.eliminar(m);
    }

    @Override
    public List<Pedidos> listar() {
        IPedidoDao idao= new PedidoDaoImpl(Pedidos.class);
        return idao.listar();
    }

    @Override
    public Pedidos buscarPorid(int id) {
        IPedidoDao idao= new PedidoDaoImpl();
        return idao.buscarPorid(id);
    }

    @Override
    public Pedidos obtenerDetallesPorPedidoId(int idPedido) {
        IPedidoDao idao= new PedidoDaoImpl();
        return idao.obtenerDetallesPorPedidoId(idPedido);
    }

    @Override
    public List<Pedidos> buscaRangoFechas(String fechaDesde, String fechaHasta) {
        IPedidoDao idao= new PedidoDaoImpl();
        return idao.buscaRangoFechas(fechaDesde, fechaHasta);
    }
    
}
