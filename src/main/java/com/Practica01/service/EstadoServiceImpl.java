/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Practica01.service;

import com.Practica01.dao.estadoDao;
import com.Practica01.domain.estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Monserrat Najera
 */
@Service
public abstract class EstadoServiceImpl implements EstadoService{
    
    @Autowired
    estadoDao estadoDao;
   
    @Override
    @Transactional(readOnly=true)
    public List<estado> getClientes() {
        return (List<estado>) estadoDao.findAll();
    }

    @Override
    public estado getCliente(estado estado) {
        return estadoDao.findById(estado.getIdEstado()).orElse(null);
    }

    @Override
    @Transactional
    public void save(estado estado) {
       estadoDao.save(estado);
    }

    @Override
    @Transactional
    public void delete(estado estado) {
        estadoDao.deleteById(estado.getIdEstado());
    }

   
    }
    

