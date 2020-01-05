/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Entidades;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author JAVIER
 */
@Entity
@Table(name = "tipoMovimiento")
public class TipoMovimiento implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMovimiento;
    private String nombreMovimiento;
    private int estado;

    
    @OneToMany(mappedBy = "tipoMovimiento")
    List<Pedidos> pedidos;

    public TipoMovimiento() {
    }

    public TipoMovimiento(int idMovimiento, String nombreMovimiento, int estado, List<Pedidos> pedidos) {
        this.idMovimiento = idMovimiento;
        this.nombreMovimiento = nombreMovimiento;
        this.estado = estado;
        this.pedidos = pedidos;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public String getNombreMovimiento() {
        return nombreMovimiento;
    }

    public void setNombreMovimiento(String nombreMovimiento) {
        this.nombreMovimiento = nombreMovimiento;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public List<Pedidos> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedidos> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "TipoMovimiento{" + "idMovimiento=" + idMovimiento + ", nombreMovimiento=" + nombreMovimiento + ", estado=" + estado + ", pedidos=" + pedidos + '}';
    }
    
    
    
}
