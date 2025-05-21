package org.dio;


import org.dio.dominio.Bootcamp;
import org.dio.dominio.Curso;
import org.dio.dominio.Dev;
import org.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Spring Boot");
        curso1.setDescricao("Descricao Java");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo(" Curso Angular");
        curso2.setDescricao("Descricao Python");
        curso2.setCargaHoraria(30);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Descricao mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descricao bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDouglas = new Dev();
        devDouglas.setNome("Douglas");
        devDouglas.inscreverBootcamp(bootcamp);
        System.out.println("=====================================");
        System.out.println("Conteudos Inscritos: " + devDouglas.getConteudosInscritos());
        System.out.println("-----");

        devDouglas.progredir();
        devDouglas.progredir();
        System.out.println("Conteudos Inscritos: " + devDouglas.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devDouglas.getConteudosConcluidos());
        System.out.println("XP: " + devDouglas.calcularTotalXP());

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("=====================================");
        System.out.println("Conteudos Inscritos: " + devPedro.getConteudosInscritos());
        System.out.println("-----");
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("Conteudos Inscritos: " + devPedro.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXP());
    }
}