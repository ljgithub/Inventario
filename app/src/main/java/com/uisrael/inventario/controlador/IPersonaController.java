/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador;

import com.uisrael.inventarioproyecto.modelo.Entidades.Usuario;
import java.util.List;


/**
 *
 * @author JAVIER
 */
public interface IPersonaController {
    public void ingresar(Usuario m);
    public Usuario actualizar(Usuario m);
    public void eliminar(Usuario m);
    public List<Usuario> listar();
    
    public Usuario buscarPorid(int id);         
}
