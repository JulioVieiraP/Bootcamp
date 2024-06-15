package com.dio.desafio.dominio;

public class Estudante {

    private String nome;
    private String email;
    private String matricula;

    public Estudante(String nome, String email, String matricula) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getMatricula() {
        return matricula;
    }
    
}
