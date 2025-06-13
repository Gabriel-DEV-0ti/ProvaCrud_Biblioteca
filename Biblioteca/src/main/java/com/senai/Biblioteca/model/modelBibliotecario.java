package com.senai.Biblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table (name = "bibliotecario")
public class modelBibliotecario {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

    @Column(nullable = false)
  private String nome;

    @Column(length = 150)
  private String email;
}
