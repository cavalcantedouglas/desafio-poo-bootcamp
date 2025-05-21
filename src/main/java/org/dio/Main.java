package org.dio;


import org.dio.dominio.Curso;
import org.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Java");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso Python");
        curso1.setDescricao("Descricao Python");
        curso1.setCargaHoraria(30);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria");
        mentoria.setDescricao("Descricao mentoria");
        mentoria.setData(LocalDate.now());
    }
}