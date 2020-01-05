/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author JAVIER
 */

@Entity
@Table(name = "zona")
public class Zona implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idZona;
    private String descripcion;
    private int estadoZona;
    
    @OneToMany(mappedBy = "zona")
    private List<Producto> productos = new ArrayList<>();

    public Zona() {
    }

    public Zona(int idZona, String descripcion, int estadoZona) {
        this.idZona = idZona;
        this.descripcion = descripcion;
        this.estadoZona = estadoZona;
    }

    public int getIdZona() {
        return idZona;
    }

    public void setIdZona(int idZona) {
        this.idZona = idZona;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstadoZona() {
        return estadoZona;
    }

    public void setEstadoZona(int estadoZona) {
        this.estadoZona = estadoZona;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Zona{" + "idZona=" + idZona + ", descripcion=" + descripcion + ", estadoZona=" + estadoZona + ", productos=" + productos + '}';
    }
    
    
}
