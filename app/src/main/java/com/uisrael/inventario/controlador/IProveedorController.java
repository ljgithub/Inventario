/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador;

import com.uisrael.inventarioproyecto.modelo.Entidades.Proveedor;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public interface IProveedorController {
    public void ingresar(Proveedor m);
    public Proveedor actualizar(Proveedor m);
    public void eliminar(Proveedor m);
    public List<Proveedor> listar();
    
    public Proveedor buscarPorid(int id);         
}
