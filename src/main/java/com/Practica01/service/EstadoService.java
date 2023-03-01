/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Practica01.service;

import com.Practica01.domain.estado;
import java.util.List;

/**
 *
 * @author Monserrat Najera
 */
public interface EstadoService {
    public List<estado>getEstados(); 
    public estado getEstado(estado estado);
    
    public void save(estado estado); // Para insertar o midificar(si viene el idestado o no)
    public void delete(estado estado); 
}
