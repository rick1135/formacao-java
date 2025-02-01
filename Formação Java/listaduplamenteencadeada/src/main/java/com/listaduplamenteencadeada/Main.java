package com.listaduplamenteencadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        lista.add("primeiro");
        lista.add("segundo");
        lista.add("terceiro");
        lista.add("quarto");

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));

        System.out.println(lista);

        lista.remove(2);
        System.out.println(lista);

        lista.add(1, "rick");
        System.out.println(lista);
    }
}