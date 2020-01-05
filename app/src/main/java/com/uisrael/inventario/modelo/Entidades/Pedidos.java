/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Entidades;

import java.util.Date;
import java.util.List;
import javax.persistence.*;


/**
 *
 * @author JAVIER
 */
@Entity
@Table(name = "pedidos")
public class Pedidos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPedido;
    @Temporal(TemporalType.DATE)
    private Date fechaHoraPedido;
    private String observaciones;
    private double totalPago;
    
   @OneToMany(mappedBy = "pedido")
   private List<DetallePedido> detallePedido;
   
   @ManyToOne(fetch = FetchType.EAGER)
   @JoinColumn(name = "fkIdUsuario")
   private Usuario usuario;

   
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "fkIdTipoMovimiento")
   private TipoMovimiento tipoMovimiento;
   
   @OneToMany(mappedBy = "pedidos")
   private List<Inventario> inventarios;

    public Pedidos() {
    }

    public Pedidos(int idPedido, Date fechaHoraPedido, String observaciones, double totalPago, List<DetallePedido> detallePedido, Usuario usuario, TipoMovimiento tipoMovimiento, List<Inventario> inventarios) {
        this.idPedido = idPedido;
        this.fechaHoraPedido = fechaHoraPedido;
        this.observaciones = observaciones;
        this.totalPago = totalPago;
        this.detallePedido = detallePedido;
        this.usuario = usuario;
        this.tipoMovimiento = tipoMovimiento;
        this.inventarios = inventarios;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaHoraPedido() {
        return fechaHoraPedido;
    }

    public void setFechaHoraPedido(Date fechaHoraPedido) {
        this.fechaHoraPedido = fechaHoraPedido;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public double getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(double totalPago) {
        this.totalPago = totalPago;
    }

    public List<DetallePedido> getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(List<DetallePedido> detallePedido) {
        this.detallePedido = detallePedido;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoMovimiento getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public List<Inventario> getInventarios() {
        return inventarios;
    }

    public void setInventarios(List<Inventario> inventarios) {
        this.inventarios = inventarios;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "idPedido=" + idPedido + ", fechaHoraPedido=" + fechaHoraPedido + ", observaciones=" + observaciones + ", totalPago=" + totalPago + ", detallePedido=" + detallePedido + ", usuario=" + usuario + ", tipoMovimiento=" + tipoMovimiento + ", inventarios=" + inventarios + '}';
    }
   
   
}
