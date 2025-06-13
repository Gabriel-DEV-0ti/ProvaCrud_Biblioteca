package com.senai.Biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.Biblioteca.model.modelBibliotecario;
import com.senai.Biblioteca.repository.repositoryBibliotecario;

@Service
public class serviceBibliotecario {
    @Autowired
    private repositoryBibliotecario repository;

    public List<modelBibliotecario>listar(){
        return repository.findAll();
    }

    public modelBibliotecario save(modelBibliotecario bibliotecario ){
        return repository.save(bibliotecario);
    }

    public void deletar(Long id){
          repository.deleteById(id);
    }
    
}
