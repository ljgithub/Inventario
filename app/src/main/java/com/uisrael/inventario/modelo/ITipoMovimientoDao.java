/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.inventario.modelo;

import com.uisrael.inventarioproyecto.modelo.Entidades.TipoMovimiento;
import java.util.List;

/**
 *
 * @author JAVIER
 */
public interface ITipoMovimientoDao {
    public void ingresar(TipoMovimiento m);
    public TipoMovimiento actualizar(TipoMovimiento m);
    public void eliminar(TipoMovimiento m);
    public List<TipoMovimiento> listar();
    
    public TipoMovimiento buscarPorid(int id);         

    public TipoMovimiento buscarPorName(String name);
}
