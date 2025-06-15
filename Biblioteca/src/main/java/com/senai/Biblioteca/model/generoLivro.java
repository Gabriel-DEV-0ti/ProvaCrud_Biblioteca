package com.senai.Biblioteca.model;

public enum generoLivro {

    ROMANCE("Romance"),
    FICCAO_CIENTIFICA("Ficção Científica"),
    FANTASIA("Fantasia"),
    TERROR("Terror"),
    SUSPENSE("Suspense"),
    AVENTURA("Aventura"),
    DRAMA("Drama"),
    COMEDIA("Comédia"),
    POESIA("Poesia"),
    BIOGRAFIA("Biografia"),
    AUTOBIOGRAFIA("Autobiografia"),
    ENSAIO("Ensaio"),
    CONTO("Conto"),
    CRONICA("Crônica");


    private final String genero;

    generoLivro(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return genero;
    }
}
