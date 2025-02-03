package com.list.exercicio;

import java.util.*;

public class Exerc2 {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        System.out.println("Telefonou para a vitima? S/N");
        respostas.add(ler.next());
        System.out.println("Esteve no local do crime? S/N");
        respostas.add(ler.next());
        System.out.println("Mora perto da vitima? S/N");
        respostas.add(ler.next());
        System.out.println("Devia para a vitima? S/N");
        respostas.add(ler.next());
        System.out.println("Ja trabalhou com a vitima? S/N");
        respostas.add(ler.next());

        Iterator<String> iterator = respostas.iterator();
        int contador=0;
        while(iterator.hasNext()){
            String resp = iterator.next();
            if(resp.equalsIgnoreCase("S")) contador++;
        }

        if(contador<2) System.out.println("Inocente");
        else if(contador == 2) System.out.println("Suspeita!");
        else if(contador >2 && contador <5) System.out.println("Cumplice");
        else if(contador == 5) System.out.println("Assasina");
        ler.close();

    }
}
