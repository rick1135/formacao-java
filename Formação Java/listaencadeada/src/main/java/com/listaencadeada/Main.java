package com.listaencadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada();
        lista.add("primeiro");
        lista.add("segundo");
        lista.add("terceiro");
        lista.add("quarto");

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));

        System.out.println(lista);

        System.out.println(lista.remove(2));
        System.out.println(lista);

        
    }
}