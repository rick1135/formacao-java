package com.pilha;

public class Exerc {
    private No noEntrada;

    public Exerc(){
        this.noEntrada = null;
    }

    public boolean isEmpty(){
        return noEntrada == null ? true : false;
    }

    public No top(){
        return noEntrada;
    }

    public void push(No novoNo){
        No noAux = noEntrada;
        noEntrada = novoNo;
        noEntrada.setProximo(noAux);
    }

    public No pop(){
        if(!this.isEmpty()){
            No noRemov = noEntrada;
            noEntrada=noEntrada.getProximo();
            return noRemov;
        }
        return null;
    }
}

