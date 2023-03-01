/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Practica01.controller;

import com.Practica01.domain.estado;
import com.Practica01.service.EstadoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class IndexController {
    
  @Autowired
   EstadoService estadoService;

   @GetMapping("/")
    public String page(Model model) {

        log.info("Informacion de estados");

        var estados = estadoService.getEstados();
        model.addAttribute("estados", estados);

        return "index";
    }
@GetMapping("/nuevoEstado")
 public String nuevocliente(estado estado){
 return "modificarEstado";
         }
 @PostMapping("guardarEstado")
 public String guardarCliente(estado cliente){
     estadoService.save(cliente);
     return"redirect:/";
 }
 @GetMapping ("/modificarEstado/{idEstado}")
 public String modificarCliente(estado estado , Model model){
     estado = estadoService.getEstado(estado);
     model.addAttribute("cliente",estado);
     return"modificarCliente";
 }
  @GetMapping ("/eliminarEstado/{idEstado}")
 public String eliminarCliente(estado estado ){
      estadoService.delete(estado);
     return"redirect:/";
 }
}
    

