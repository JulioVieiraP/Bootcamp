package com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private List<Curso> cursos;
    private List<Instrutor> instrutores;
    private List<Estudante> estudantes;

    public Bootcamp(String nome, String descricao, LocalDate dataInicial, LocalDate dataFinal) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.cursos = new ArrayList<>();
        this.instrutores = new ArrayList<>();
        this.estudantes = new ArrayList<>();
    }

    
    public String getNome() {
        return nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public LocalDate getDataInicial() {
        return dataInicial;
    }
    
    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }
    
    public void adicionarCurso(Curso curso){
        cursos.add(curso);
    }
    
    public void adicionarInstrutor(Instrutor instrutor){
        instrutores.add(instrutor);
    }
    
    public void adicionarEstudante(Estudante estudante){
        estudantes.add(estudante);
    }

}