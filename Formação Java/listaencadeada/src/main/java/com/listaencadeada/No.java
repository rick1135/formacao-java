package com.listaencadeada;

public class No<T> {
    private T conteudo;
    private No proximoNo;

    public No(){
        this.proximoNo = null;
    }

    public No(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public No(T conteudo, No proximoNo){
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
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

    public String toStringEncadeado() {
        String retorno = "No{" +
                "conteudo=" + conteudo +
                '}';

        if (proximoNo != null){
            retorno += "->" + proximoNo.toString();
        } else {
            retorno += "->null";
        }

        return retorno;
    }
}
