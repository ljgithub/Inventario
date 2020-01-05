/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Entidades;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author JAVIER
 */
@Entity
@Table(name = "unidadMedida")
public class UnidadMedida {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idMedida;
    private String TipoMedida;
    private String estado;

    @OneToMany(mappedBy = "unidadMedida")
    private List<Producto> producto;

    public UnidadMedida() {
    }

    public UnidadMedida(int idMedida, String TipoMedida, String estado, List<Producto> producto) {
        this.idMedida = idMedida;
        this.TipoMedida = TipoMedida;
        this.estado = estado;
        this.producto = producto;
    }

    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
    public int getIdMedida() {
        return idMedida;
    }

    public void setIdMedida(int idMedida) {
        this.idMedida = idMedida;
    }

    public String getTipoMedida() {
        return TipoMedida;
    }

    public void setTipoMedida(String TipoMedida) {
        this.TipoMedida = TipoMedida;
    }

    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "UnidadMedida{" + "idMedida=" + idMedida + ", TipoMedida=" + TipoMedida + ", estado=" + estado + ", producto=" + producto + '}';
    }

    
    
}
