package com.senai.Biblioteca.model;

public enum statusLivro {
    DISPONIVEL ("Disponível"),
    EMPRESTADO ("Emprestado"),
    RESERVADO ("Reservado");

    private final String status;

    statusLivro(String status){
        this.status = status;
    }

    public String getStatus (){
        return status;
    }
}
