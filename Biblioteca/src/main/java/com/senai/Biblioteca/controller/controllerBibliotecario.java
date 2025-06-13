package com.senai.Biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.Biblioteca.model.modelBibliotecario;
import com.senai.Biblioteca.service.serviceBibliotecario;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/bibliotecario")
public class controllerBibliotecario {
    @Autowired
    private serviceBibliotecario service;

    @PostMapping
    public modelBibliotecario salvar(@RequestBody modelBibliotecario bibliotecario){
        return service.save(bibliotecario);
    } 
}
