import java.time.LocalDate;

import com.dio.desafio.dominio.*;

public class Main {
    public static void main(String[] args) {
        // Criando o curso Java
        Curso cursoJava = new Curso("Java Básico", "Curso introdutório de Java");

        // Criando módulos e adicionando aulas
        Modulo modulo1 = new Modulo("Fundamentos de Java", "Módulo introdutório sobre os fundamentos de Java");
        modulo1.adicionarAula(new Aula("Introdução ao Java", "Aula introdutória sobre Java"));
        modulo1.adicionarAula(new Aula("Variáveis e Tipos de Dados", "Aula sobre variáveis e tipos de dados"));

        Modulo modulo2 = new Modulo("Estruturas de Dados em Java", "Módulo avançado sobre estruturas de dados em Java");
        modulo2.adicionarAula(new Aula("Listas em Java", "Aula sobre listas em Java"));
        modulo2.adicionarAula(new Aula("Árvores em Java", "Aula sobre árvores em Java"));

        // Adicionando módulos ao curso
        cursoJava.adicionarModulo(modulo1);
        cursoJava.adicionarModulo(modulo2);

        // Criando os instrutores
        Instrutor João = new Instrutor("João Silva", "joao.silva@example.com");
        Instrutor Maria = new Instrutor("Maria Souza", "maria.souza@example.com");

        // Criando os estudantes
        Estudante Pedro = new Estudante("Pedro Rocha", "pedro.rocha@example.com", "2023001");
        Estudante Ana = new Estudante("Ana Oliveira", "ana.oliveira@example.com", "2023002");

        // Criando o bootcamp
        LocalDate dataInicial = LocalDate.of(2024, 7, 1);
        LocalDate dataFinal = LocalDate.of(2024, 12, 31);

        Bootcamp bootcamp = new Bootcamp("Bootcamp de Programação", "Bootcamp de Java e Python", dataInicial, dataFinal);
        bootcamp.adicionarCurso(cursoJava);
        bootcamp.adicionarInstrutor(João);
        bootcamp.adicionarInstrutor(Maria);
        bootcamp.adicionarEstudante(Pedro);
        bootcamp.adicionarEstudante(Ana);

        // Exemplo de utilização dos métodos
        System.out.println("Detalhes do Bootcamp:");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Nome do Bootcamp: " + bootcamp.getNome());
        System.out.println("Descrição do Bootcamp: " + bootcamp.getDescricao());
        System.out.println("Data Inicial: " + bootcamp.getDataInicial());
        System.out.println("Data Final: " + bootcamp.getDataFinal());
        System.out.println("----------------------------------------------------------------");

        System.out.println("\nInstrutores no Bootcamp:");
        for (Instrutor instrutor : bootcamp.getInstrutores()) {
            System.out.println("- " + instrutor.getNome());
        }

        System.out.println("\nEstudantes no Bootcamp:");
        for (Estudante estudante : bootcamp.getEstudantes()) {
            System.out.println("- " + estudante.getNome() + " (" + estudante.getMatricula() + ")");
        }

        // Exibição dos módulos e aulas do curso Java diretamente no main()
        System.out.println("\nMódulos e Aulas do Curso " + cursoJava.getNome() + ":");
        for (Modulo modulo : cursoJava.getModulos()) {
            System.out.println("\nMódulo: " + modulo.getNome());
            for (Aula aula : modulo.getAulas()) {
                System.out.println("- " + aula.getNome());
            }
        }

        // Exemplo de um instrutor ensinando um curso
        System.out.println("----------------------------------------------------------------");
        João.ensinarCurso(cursoJava.getNome());
        System.out.println("----------------------------------------------------------------");
    }
}
