package com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Modulo extends Conteudo {
    private List<Aula> aulas;

    public Modulo(String nome, String descricao) {
        super(nome, descricao);
        this.aulas = new ArrayList<>();
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void adicionarAula(Aula aula) {
        aulas.add(aula);
    }
}
