package com.senai.Biblioteca.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.Biblioteca.model.modelLivros;
import com.senai.Biblioteca.service.serviceLivros;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/dados_livro")
public class controllerLivros {
    @Autowired
    private serviceLivros service;

    @GetMapping
    public List<modelLivros> listar(){
        return service.listar();
    }

    @PostMapping
    public modelLivros salvar(@RequestBody modelLivros livros){
        return service.save(livros);
    }

    @GetMapping("/{id}")
  public ResponseEntity<modelLivros>buscarPorID(@PathVariable Long id) {
      return service.buscarPorID(id)
        .map(ResponseEntity::ok)
          .orElse(ResponseEntity.notFound().build());
  }


  @PutMapping("/{id}")
    public ResponseEntity<modelLivros> atualizar(@PathVariable Long id, @RequestBody modelLivros studentModel) {
    Optional<modelLivros> livrostOpt  = service.buscarPorID(id);
    
    if (!livrostOpt.isPresent()) {  
                return ResponseEntity.notFound().build();
    }
    
    modelLivros existingLivros = livrostOpt.get();
    modelLivros modelLivros = new modelLivros();
    modelLivros.setTitulo(modelLivros.getTitulo());
    existingLivros.setAutor(modelLivros.getAutor());
    existingLivros.setGenero(modelLivros.getGenero());
    existingLivros.setStatus(modelLivros.getStatus());
    existingLivros.setData(modelLivros.getData());
    
    modelLivros updatedLivros = service.save(existingLivros);
    
    return ResponseEntity.ok(updatedLivros);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deletar(@PathVariable Long id){
    if (!service.buscarPorID(id).isPresent()) {
        return ResponseEntity.notFound().build();
    }
    service.deletar(id);
    return ResponseEntity.noContent().build();
  }
}
