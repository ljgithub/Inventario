/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador;

import com.uisrael.inventarioproyecto.modelo.Entidades.Inventario;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public interface IInventarioController {
    public void ingresar(Inventario m);
    public Inventario actualizar(Inventario m);
    public void eliminar(Inventario m);
    public List<Inventario> listar();
    
    public Inventario buscarPorid(int id);         

    public List<Inventario> consultarStock();
}
