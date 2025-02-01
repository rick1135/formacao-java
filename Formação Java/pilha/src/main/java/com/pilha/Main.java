package com.pilha;

public class Main{
    public static void main(String[] args) {
        Pilha minhaPilha = new Pilha();
        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        System.out.println(minhaPilha);
        System.out.println("Topo da pilha: " + minhaPilha.top());
        System.out.println("Removendo o topo da pilha: " + minhaPilha.pop());
        System.out.println("Topo da pilha: " + minhaPilha.top());
        System.out.println(minhaPilha);
    }
}