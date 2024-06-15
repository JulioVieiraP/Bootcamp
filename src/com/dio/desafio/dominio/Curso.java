package com.dio.desafio.dominio;

import java.util.ArrayList;
import java.util.List;

public class Curso extends Conteudo {
    private List<Modulo> modulos;

    public Curso(String nome, String descricao) {
        super(nome, descricao);
        this.modulos = new ArrayList<>();
    }

    public List<Modulo> getModulos() {
        return modulos;
    }

    public void adicionarModulo(Modulo modulo) {
        modulos.add(modulo);
    }
}
