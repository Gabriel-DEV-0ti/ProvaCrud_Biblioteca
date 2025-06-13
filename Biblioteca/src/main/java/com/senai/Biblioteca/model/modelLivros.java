package com.senai.Biblioteca.model;

import java.sql.Date;

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
@Table (name = "dados_livro")
public class modelLivros {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

    @Column(nullable = false)
  private String titulo;

      @Column(nullable = false)
  private String autor;
  
    @Column(nullable = false)
  private String genero;

    @Column(nullable = false)
  private Enum status;

  @Column(nullable = false)
  private Date data;
}