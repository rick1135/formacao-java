package com;

import java.util.*;

public class Exerc {
    public static void main(String[] args) {
        Set<String> cores = new HashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo"));

        //A) Exiba todas as cores uma abaixo da outra
        for (String cor : cores) {
            System.out.println(cor);
        }

        //B) A quantidade de cores que o arco-íris tem
        System.out.println("Quantidade de cores: " + cores.size());

        //C) Exiba as cores em ordem alfabética
        Set<String> coresOrdenadas = new TreeSet<>(cores); 
        for (String cor : coresOrdenadas) {
            System.out.println(cor);
        }

        //D) Exiba as cores na ordem inversa que foi informada
        List<String> listaCores = new ArrayList<>(cores);
        Collections.reverse(listaCores);
        for (String cor : listaCores) {
            System.out.println(cor);
        }

        //E) Exiba todas as cores que começam com a letra "v"
        System.out.println("Cores que comecam com a letra 'v': ");
        for (String cor : listaCores) {
            if(cor.toLowerCase().startsWith("v")) System.out.println(cor);
        }

        //F) Remova todas as cores que não começam com a letra "v"
        Iterator<String> iterator = cores.iterator();
        while (iterator.hasNext()){
            String cor = iterator.next();
            if(!cor.toLowerCase().startsWith("v")) iterator.remove();
        }
        System.out.println("Cores restantes: ");
        for (String cor : cores) {
            System.out.println(cor);
        }

        //G) Limpe o conjunto
        cores.clear();
        System.out.println("Cores apos limpar o conjunto: " + cores);

        //H) Confira se o conjunto está vazio
        if (cores.isEmpty()) System.out.println("Conjunto vazio!");
        else System.out.println("Conjunto nao esta vazio!");
    }   
}
