package com.listaduplamenteencadeada;

public class No<T> {
    private T conteudo;
    private No noAnterior;
    private No proximoNo;

    public No(T conteudo){
        this.conteudo = conteudo;
    }

    public T getConteudo(){
        return conteudo;
    }

    public void setConteudo(T conteudo){
        this.conteudo = conteudo;
    }

    public No getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(No noAnterior) {
        this.noAnterior = noAnterior;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }

    
}
