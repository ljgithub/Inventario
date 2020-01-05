/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador;

import com.uisrael.inventarioproyecto.modelo.Entidades.Cliente;
import java.util.List;


/**
 *
 * @author JAVIER
 */
public interface IClienteController {
    public void ingresar(Cliente m);
    public Cliente actualizar(Cliente m);
    public void eliminar(Cliente m);
    public List<Cliente> listar();
    
    public Cliente buscarPorid(int id);         
}
