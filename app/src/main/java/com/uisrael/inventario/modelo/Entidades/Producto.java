/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author JAVIER
 */
@Entity
@Table(name = "producto")
public class Producto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProducto;
    private String codigoProducto;
    private String descripcionProducto;
    private double valorUnitario;    
    private int iva;
    private double peso;
    private String marca;
    private int estadoProducto;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_IdProveedor")
    private Proveedor proveedor;
    
       
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_IdZona")
    private Zona zona;

    @OneToMany (mappedBy = "producto")
    private List<DetallePedido> detallePedido;

    @ManyToOne
    @JoinColumn(name = "fkIdUnidadMedidas")
    private UnidadMedida unidadMedida;

    @OneToMany(mappedBy = "producto")
    private List<Inventario> inventarios;

    public Producto() {
    }

    public Producto(int idProducto, String codigoProducto, String descripcionProducto, double valorUnitario, int iva, double peso, String marca, int estadoProducto, Proveedor proveedor, Zona zona, List<DetallePedido> detallePedido, UnidadMedida unidadMedida, List<Inventario> inventarios) {
        this.idProducto = idProducto;
        this.codigoProducto = codigoProducto;
        this.descripcionProducto = descripcionProducto;
        this.valorUnitario = valorUnitario;
        this.iva = iva;
        this.peso = peso;
        this.marca = marca;
        this.estadoProducto = estadoProducto;
        this.proveedor = proveedor;
        this.zona = zona;
        this.detallePedido = detallePedido;
        this.unidadMedida = unidadMedida;
        this.inventarios = inventarios;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(int estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public List<DetallePedido> getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(List<DetallePedido> detallePedido) {
        this.detallePedido = detallePedido;
    }

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public List<Inventario> getInventarios() {
        return inventarios;
    }

    public void setInventarios(List<Inventario> inventarios) {
        this.inventarios = inventarios;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", codigoProducto=" + codigoProducto + ", descripcionProducto=" + descripcionProducto + ", valorUnitario=" + valorUnitario + ", iva=" + iva + ", peso=" + peso + ", marca=" + marca + ", estadoProducto=" + estadoProducto + ", proveedor=" + proveedor + ", zona=" + zona + ", detallePedido=" + detallePedido + ", unidadMedida=" + unidadMedida + ", inventarios=" + inventarios + '}';
    }
    
    
    
}
