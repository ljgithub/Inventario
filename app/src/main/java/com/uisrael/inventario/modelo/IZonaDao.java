/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventario.modelo;

import com.uisrael.inventarioproyecto.modelo.Entidades.Zona;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public interface IZonaDao {
    public void ingresar(Zona m);
    public Zona actualizar(Zona m);
    public void eliminar(Zona m);
    public List<Zona> listar();
    
    public Zona buscarPorid(int id);         
}
