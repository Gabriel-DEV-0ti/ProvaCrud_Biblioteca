package com.senai.Biblioteca.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.Biblioteca.model.modelLivros;
import com.senai.Biblioteca.repository.repositoryLivros;

@Service
public class serviceLivros {
    @Autowired
    private repositoryLivros repository;

    public List<modelLivros>listar(){
        return repository.findAll();
    }

    public modelLivros adicionarLivro (modelLivros livros ){
        return repository.save(livros);
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

    public Optional<modelLivros> buscarPorID(Long id){
        return repository.findById(id);
    }

    public List<modelLivros> listarPorBibliotecario(Long id) {
        return repository.findByBibliotecario_id(id);
    }
}
