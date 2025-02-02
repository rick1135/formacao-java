package com.listaduplamenteencadeada;

public class No<T> {
    private T conteudo;
    private No<T> noAnterior;
    private No<T> proximoNo;

    public No(T conteudo){
        this.conteudo = conteudo;
    }

    public T getConteudo(){
        return conteudo;
    }

    public void setConteudo(T conteudo){
        this.conteudo = conteudo;
    }

    public No<T> getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(No<T> noAnterior) {
        this.noAnterior = noAnterior;
    }

    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }

    
}
