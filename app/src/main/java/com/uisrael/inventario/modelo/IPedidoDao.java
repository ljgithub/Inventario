/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventario.modelo;

import com.uisrael.inventarioproyecto.modelo.Entidades.Pedidos;
import java.util.List;



/**
 *
 * @author JAVIER
 */
public interface IPedidoDao {
    public void ingresar(Pedidos m);
    public Pedidos actualizar(Pedidos m);
    public void eliminar(Pedidos m);
    public List<Pedidos> listar();
    
    public Pedidos buscarPorid(int id);         

    public Pedidos obtenerDetallesPorPedidoId(int idPedido);

    public List<Pedidos> buscaRangoFechas(String fechaDesde, String fechaHasta);
}
