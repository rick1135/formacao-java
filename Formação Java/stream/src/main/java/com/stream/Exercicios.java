package com.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Exercicios {
    public static void main(String[] args) {
        List<String> numeros = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        // imprimindo todos numeros da lista
        // numeros.forEach(s -> System.out.println(s));

        // pegue os 5 primeiros numeros e coloque dentro de um set
        // numeros.stream().limit(5).collect(Collectors.toSet()).forEach(s -> System.out.println(s));
        
        // transformar lista de string em inteiro
        // numeros.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList()).forEach(System.out::println);
        
        //Números pares e maiores que 2
        // numeros.stream().map(s -> Integer.parseInt(s)).filter(i->i%2==0 && i>2).collect(Collectors.toList()).forEach(System.out::println);   
        
        //media dos numeros
        // numeros.stream().mapToInt(s -> Integer.parseInt(s)).average().ifPresent(System.out::println);

        //remover os impares
        List<Integer> pares = numeros.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        pares.removeIf(integer -> integer%2!=0);
        System.out.println(pares);
    }
}
