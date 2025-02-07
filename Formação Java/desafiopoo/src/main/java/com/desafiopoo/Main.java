package com.desafiopoo;

import java.time.LocalDate;

import com.desafiopoo.dominio.Bootcamp;
import com.desafiopoo.dominio.Curso;
import com.desafiopoo.dominio.Dev;
import com.desafiopoo.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("curso java");
        curso.setDescricao("descricao");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("milhas");
        mentoria.setDescricao("maik");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descricao");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devRick = new Dev();
        devRick.setNome("Rick");;
        devRick.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Rick: " + devRick.getConteudosInscritos());
        System.out.println("Conteudos concluidos Rick: " + devRick.getconteudosConcluidos());
        System.out.println("XP Rick: " + devRick.calcularTotalXp());
        System.out.println("-");
        devRick.progredir();
        System.out.println("Conteudos concluidos Rick: " + devRick.getconteudosConcluidos());
        System.out.println("Conteudos inscritos Rick: " + devRick.getConteudosInscritos());
        System.out.println("XP Rick: " + devRick.calcularTotalXp());
        System.out.println("-");
        devRick.progredir();
        System.out.println("Conteudos concluidos Rick: " + devRick.getconteudosConcluidos());
        System.out.println("Conteudos inscritos Rick: " + devRick.getConteudosInscritos());
        System.out.println("XP Rick: " + devRick.calcularTotalXp());
        
        System.out.println("-");
        
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos Joao: " + devJoao.getconteudosConcluidos());
        System.out.println("XP Joao: " + devJoao.calcularTotalXp());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos Joao: " + devJoao.getconteudosConcluidos());
        System.out.println("XP Joao: " + devJoao.calcularTotalXp());
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos Joao: " + devJoao.getconteudosConcluidos());
        System.out.println("XP Joao: " + devJoao.calcularTotalXp());
        devJoao.progredir();

    }
}