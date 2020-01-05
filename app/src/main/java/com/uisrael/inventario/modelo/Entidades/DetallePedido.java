/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author JAVIER
 */
@Entity
@Table(name = "detalle_pedido")
public class DetallePedido implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idDetalle;
    private int cantidad;
    private double descuento;
    
    @ManyToOne
    @JoinColumn(name = "fkIdProducto")
    private Producto producto;
            
    @ManyToOne
    @JoinColumn(name ="fkIdPedido")
    private Pedidos pedido;

    public DetallePedido() {
    }

    public DetallePedido(int idDetalle, int cantidad, double descuento, Producto producto, Pedidos pedido) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.producto = producto;
        this.pedido = pedido;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Pedidos getPedido() {
        return pedido;
    }

    public void setPedido(Pedidos pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "DetallePedido{" + "idDetalle=" + idDetalle + ", cantidad=" + cantidad + ", descuento=" + descuento + ", producto=" + producto + ", pedido=" + pedido + '}';
    }
    
}
