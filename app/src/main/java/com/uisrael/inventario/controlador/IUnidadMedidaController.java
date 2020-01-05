/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventarioproyecto.controlador;

import com.uisrael.inventarioproyecto.modelo.Entidades.UnidadMedida;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public interface IUnidadMedidaController {
    public void ingresar(UnidadMedida m);
    public UnidadMedida actualizar(UnidadMedida m);
    public void eliminar(UnidadMedida m);
    public List<UnidadMedida> listar();
    
    public UnidadMedida buscarPorid(int id);         
}
