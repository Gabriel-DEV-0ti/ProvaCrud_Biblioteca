package com.senai.Biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.Biblioteca.model.modelBibliotecario;

@Repository
public interface repositoryBibliotecario extends JpaRepository<modelBibliotecario, Long>{}
