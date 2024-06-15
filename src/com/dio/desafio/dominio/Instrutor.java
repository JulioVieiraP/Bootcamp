package com.dio.desafio.dominio;

public class Instrutor {
    private String nome;
    private String email;

    public Instrutor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void ensinarCurso(String curso){
        System.out.println("O instrutor " + this.nome + " está ensinando o curso " + curso);
    }
}
