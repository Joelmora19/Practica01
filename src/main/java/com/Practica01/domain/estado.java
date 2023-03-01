/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Practica01.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Monserrat Najera
 */

@Data
@Entity
@Table(name="estado")

public class estado implements Serializable {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long idEstado;
    private String nombreEstado;
    private String capital;
    private String poblacion;

    public estado() {
    }
    public estado(Long idEstado, String nombreEstado, String capital, String poblacion) {
        this.idEstado = idEstado;
        this.nombreEstado = nombreEstado;
        this.capital = capital;
        this.poblacion = poblacion;
    }
    
    
}
