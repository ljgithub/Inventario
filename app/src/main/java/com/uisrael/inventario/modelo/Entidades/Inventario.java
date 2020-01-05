/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Entidades;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author JAVIER
 */
@Entity
@Table(name = "inventario")
public class Inventario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idInventario;
    private int cantidad;
    
    
    @ManyToOne
    @JoinColumn(name = "fkIdProducto")
    private Producto producto;
    
    
    @ManyToOne
    @JoinColumn(name = "fkIdPedido")
    private Pedidos pedidos;

    public Inventario() {
    }

    public Inventario(int idInventario, int cantidad, Producto producto, Pedidos pedidos) {
        this.idInventario = idInventario;
        this.cantidad = cantidad;
        this.producto = producto;
        this.pedidos = pedidos;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Pedidos getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedidos pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "Inventario{" + "idInventario=" + idInventario + ", cantidad=" + cantidad + ", producto=" + producto + ", pedidos=" + pedidos + '}';
    }
         
}
