/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Dao.Impl;

import com.uisrael.inventarioproyecto.controlador.IMPL.*;
import com.uisrael.inventarioproyecto.controlador.IPedidoController;
import com.uisrael.inventarioproyecto.modelo.Entidades.Pedidos;
import com.uisrael.inventarioproyecto.modelo.IPedidoDao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.TypedQuery;

/**
 *
 * @author JAVIER
 */
public class PedidoDaoImpl extends GenericaDaoImpl<Pedidos>implements IPedidoDao{

    public PedidoDaoImpl() {
    }

    public PedidoDaoImpl(Class<Pedidos> entityClass) {
        super(entityClass);
    }

    
    
    @Override
    public void ingresar(Pedidos m) {
        this.create(m);
    }

    @Override
    public Pedidos actualizar(Pedidos m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Pedidos m) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pedidos> listar() {
        return this.findAll();
    }

    @Override
    public Pedidos buscarPorid(int id) {
        String sentencia = "select t from Pedidos t where t.idPedido = " +id;

        TypedQuery<Pedidos> typed = this.entityManager.createQuery(sentencia, Pedidos.class);
                
        Pedidos resultado = typed.getSingleResult();
                        
        return resultado;
    }

    @Override
    public Pedidos obtenerDetallesPorPedidoId(int idPedido) {
        String sentencia = "select t from Pedidos t join fetch t.detallePedido where t.idPedido = " +idPedido;

        TypedQuery<Pedidos> typed = this.entityManager.createQuery(sentencia, Pedidos.class);
                
        Pedidos resultado = typed.getSingleResult();
                        
        return resultado;
    }

    @Override
    public List<Pedidos> buscaRangoFechas(String fechaDesde, String fechaHasta) {
        List<Pedidos> resultado = new ArrayList<>();
        Date fechaBusquedaIni;
        try {
            
            SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");            
            /*fechaBusquedaIni = format.parse(fechaDesde);     
            format.format(fechaBusquedaIni);*/
            
            fechaBusquedaIni = Calendar.getInstance().getTime();
                                  
            String sentencia = "select t from Pedidos t where t.fechaHoraPedido = " + fechaBusquedaIni;
            
            TypedQuery<Pedidos> typed = this.entityManager.createQuery(sentencia, Pedidos.class);
            
            resultado = typed.getResultList();
            
            System.out.println("Consulta Ejecutada");
        } catch (Exception ex) {
            Logger.getLogger(PedidoDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return resultado;
        }
            
      
        
    }

   
    
}