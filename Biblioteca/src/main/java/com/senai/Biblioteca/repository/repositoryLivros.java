package com.senai.Biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.Biblioteca.model.modelLivros;

@Repository
public interface repositoryLivros extends JpaRepository <modelLivros , Long> {}
