/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.modelo.Entidades;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author JAVIER
 */
@Entity
@Table(name = "rol")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRol;
    private String descripcionRol;
    private int estado;

   @OneToMany(mappedBy = "rol") 
   private List<Usuario> persona = new ArrayList<Usuario>();

    public Rol() {
    }

    public Rol(int idRol, String descripcionRol, int estado) {
        this.idRol = idRol;
        this.descripcionRol = descripcionRol;
        this.estado = estado;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getDescripcionRol() {
        return descripcionRol;
    }

    public void setDescripcionRol(String descripcionRol) {
        this.descripcionRol = descripcionRol;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public List<Usuario> getPersona() {
        return persona;
    }

    public void setPersona(List<Usuario> persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Rol{" + "idRol=" + idRol + ", descripcionRol=" + descripcionRol + ", estado=" + estado + ", persona=" + persona + '}';
    }
   
   
    
}
