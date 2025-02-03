package com.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("criando conjunto e adicionando as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        System.out.println("A nota 5.0 está no conjunto? " + notas.contains(5.0));

        System.out.println("A menor nota: " + Collections.min(notas));
        System.out.println("A maior nota: " + Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Media das notas: " + (soma/notas.size()));
        notas.remove(0.0);
        System.out.println("Conjunto apos remocao da nota 0: " + notas);

        iterator = notas.iterator();
        while(iterator.hasNext()){
            Double next = iterator.next();
            if (next<7) {
                iterator.remove();
            }
        }
        System.out.println("Conjunto apos remocao dos valores menores que 7: " + notas);
        
    }
}