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
@Table(name = "proveedor")
public class Proveedor implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProveedor;
    private String razonSocial;    
    private int telefono;
    private int celular;
    private String direccion;
    private String ciudad;
    private String email;
    private int estadoProveedor;
    
    @OneToMany(mappedBy = "proveedor")
    private List<Producto> productos = new ArrayList<>();
    
  

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String razonSocial, int telefono, int celular, String direccion, String ciudad, String email, int estadoProveedor) {
        this.idProveedor = idProveedor;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.email = email;
        this.estadoProveedor = estadoProveedor;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    
    
    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

   
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEstadoProveedor() {
        return estadoProveedor;
    }

    public void setEstadoProveedor(int estadoProveedor) {
        this.estadoProveedor = estadoProveedor;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", razonSocial=" + razonSocial + ", telefono=" + telefono + ", celular=" + celular + ", direccion=" + direccion + ", ciudad=" + ciudad + ", email=" + email + ", estadoProveedor=" + estadoProveedor + ", productos=" + productos + '}';
    }

 
    
}
