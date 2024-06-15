package com.dio.desafio.dominio;

public class Conteudo {
    private String nome;
    private String descricao;

    public Conteudo(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }
}
