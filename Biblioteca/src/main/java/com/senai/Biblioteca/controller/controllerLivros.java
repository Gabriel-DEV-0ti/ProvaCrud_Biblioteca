package com.senai.Biblioteca.controller;

import java.util.List;

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
import com.senai.Biblioteca.model.generoLivro;
import com.senai.Biblioteca.model.statusLivro;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/dados_livro")
public class controllerLivros {
    @Autowired
    private serviceLivros service;

    @GetMapping
    public List<modelLivros> listarLivros(){
        return service.listar();
    }

    @PostMapping
    public modelLivros salvar(@RequestBody modelLivros livros){
        return service.adicionarLivro(livros);
    }

    @GetMapping("/{id}")
  public ResponseEntity<modelLivros>buscarPorID(@PathVariable Long id) {
      return service.buscarPorID(id)
        .map(ResponseEntity::ok)
          .orElse(ResponseEntity.notFound().build());
  }

  @GetMapping("/filtrar/bibliotecaio/{id}")
    public ResponseEntity <List <modelLivros>>filtrar(
      @PathVariable Long id){
        List <modelLivros>result;
        if (id != null) {
            result = service.listarPorBibliotecario(id);
        }else {
          result = service.listar();
        }
        return result.isEmpty()? ResponseEntity.noContent().build(): ResponseEntity.ok(result);
      }

    @GetMapping ("/generos")
    public generoLivro[] listarGeneros(){
      return generoLivro.values();
    }

    @GetMapping ("/status")
    public statusLivro[] listarStatus(){
      return statusLivro.values();
    }


  @PutMapping("/{id}")
    public ResponseEntity<Object> atualizar(@PathVariable Long id, @RequestBody modelLivros livros){
      if (!service.buscarPorID(id).isPresent()) {
        return ResponseEntity.notFound().build();
      }
      livros.setId(id);
      return ResponseEntity.ok(service.adicionarLivro(livros));
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
