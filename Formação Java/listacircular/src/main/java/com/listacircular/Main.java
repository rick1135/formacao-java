package com.listacircular;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> lista = new ListaCircular<>();

        lista.add("c1");
        lista.add("c2");
        lista.add("c3");
        lista.add("c4");
        System.out.println(lista);

        lista.remove(2);
        System.out.println(lista);

        lista.add("Rick");
        System.out.println(lista);

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));

    }
}