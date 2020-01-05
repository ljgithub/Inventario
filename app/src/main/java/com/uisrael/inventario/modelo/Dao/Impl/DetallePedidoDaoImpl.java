/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Dao.Impl;

import com.uisrael.inventarioproyecto.controlador.IMPL.*;
import com.uisrael.inventarioproyecto.controlador.IDetallePedidoController;
import com.uisrael.inventarioproyecto.modelo.Entidades.DetallePedido;
import com.uisrael.inventarioproyecto.modelo.Entidades.Inventario;
import com.uisrael.inventarioproyecto.modelo.Entidades.Pedidos;
import com.uisrael.inventarioproyecto.modelo.IDetallePedidoDao;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

/**
 *
 * @author JAVIER
 */
public class DetallePedidoDaoImpl extends GenericaDaoImpl<DetallePedido> implements IDetallePedidoDao {

    public DetallePedidoDaoImpl() {
    }

    public DetallePedidoDaoImpl(Class<DetallePedido> entityClass) {
        super(entityClass);
    }

    @Override
    public void ingresar(DetallePedido m) {
        this.create(m);
    }

    @Override
    public DetallePedido actualizar(DetallePedido m) {
        return this.update(m);
    }

    @Override
    public void eliminar(DetallePedido m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DetallePedido> listar() {
        return this.findAll();
    }

    @Override
    public DetallePedido buscarPorid(int id) {
        String sentencia = "select t from DetallePedido t where t.idDetalle = " + id;

        TypedQuery<DetallePedido> typed = this.entityManager.createQuery(sentencia, DetallePedido.class);

        DetallePedido resultado = typed.getSingleResult();

        return resultado;
    }

    public List<DetallePedido> buscarDetallesPorIdPedido(int idPedido) {
        List<DetallePedido> listaDetalles = new ArrayList<>();
        String sentencia = "select t from DetallePedido t where t.pedido.idPedido = " + idPedido;
        TypedQuery<DetallePedido> typed = this.entityManager.createQuery(sentencia, DetallePedido.class);
        listaDetalles = typed.getResultList();

        return listaDetalles;
    }
    
    

}
