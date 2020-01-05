/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventario.modelo;

import com.uisrael.inventarioproyecto.modelo.Entidades.Rol;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public interface IRolDao {
    public void ingresar(Rol m);
    public Rol actualizar(Rol m);
    public void eliminar(Rol m);
    public List<Rol> listar();
    
    public Rol buscarPorid(int id);         
}
