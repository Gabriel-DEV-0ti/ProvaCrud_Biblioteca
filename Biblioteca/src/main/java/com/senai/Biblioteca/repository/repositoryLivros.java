package com.senai.Biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.Biblioteca.model.modelLivros;

@Repository
public interface repositoryLivros extends JpaRepository <modelLivros , Long> {

    List<modelLivros> findByBibliotecario_id(Long id);
}
