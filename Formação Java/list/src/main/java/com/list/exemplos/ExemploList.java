package com.list.exemplos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        //Criar uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6]

        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);
        System.out.println("Posicao da nota 5.0: " + notas.indexOf(5.0));
        notas.add(4, 8d);
        System.out.println(notas);
        notas.set(notas.indexOf(5.0), 6.0);
        System.out.println(notas);
        System.out.println("A nota 5 esta na lista? " + notas.contains(5d));
        Double soma = 0d;
        for (Double nota : notas) {
            soma+=nota;
        }
        System.out.println("Soma dos vaLores: " + soma);
        System.out.println("Média das notas:" + (soma/notas.size()));
        System.out.println("Removendo as notas menores que 7:");
        Iterator<Double> iterator = notas.iterator();
        while(iterator.hasNext()){
            double nota = iterator.next();
            if(nota<7){
                System.out.println(nota + " removido");
                iterator.remove();
            }
        }
        System.out.println(notas);
    }
}
