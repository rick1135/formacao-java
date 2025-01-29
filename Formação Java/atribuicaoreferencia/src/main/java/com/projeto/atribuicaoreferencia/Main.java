package com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args) {
        int A = 1;
        int B = A;
        System.out.println("A: " + A);
        System.out.println("B: " + B);

        A = 2;
        System.out.println("A: " + A);
        System.out.println("B: " + B);


        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;
        System.out.println("objA: " + objA);
        System.out.println("objB: " + objB);

        objA.setNum(2);
        System.out.println("objA: " + objA);
        System.out.println("objB: " + objB);
    }
}