package com.pilha;

public class Pilha {
    private No noEntrada;

    public Pilha() {
        this.noEntrada=null;
    }

    public No top(){
        return noEntrada;
    }

    public boolean isEmpty(){
        return noEntrada == null ? true : false;
    }

    public void push(No novoNo){
        No aux = noEntrada;
        noEntrada = novoNo;
        noEntrada.setProximo(aux);
    }

    public No pop(){
        if(!this.isEmpty()){
            No aux = noEntrada;
            noEntrada = noEntrada.getProximo();
            return aux;
        }
        return null;
    }

    @Override
    public String toString() {
        String str = "";
        No aux = noEntrada;
        while(aux != null){
            str += aux.toString() + "\n";
            aux = aux.getProximo();
        }
        return str;
    }
}
