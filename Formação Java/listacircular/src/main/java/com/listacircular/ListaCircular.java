package com.listacircular;

public class ListaCircular<T> {
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanho;

    public ListaCircular(){
        this.cabeca=null;
        this.cauda=null;
        this.tamanho=0;
    }

    public int size(){
        return this.tamanho;
    }

    public boolean isEmpty(){
        return this.tamanho == 0 ? true : false;
    }

    private No<T> getNo(int indice){
        if(this.isEmpty()) throw new IndexOutOfBoundsException("Lista está vazia!");
        if(indice == 0) return this.cauda;
        No<T> aux = this.cauda;
        for(int i=0;(i<indice) && (aux!=null); i++){
            aux = aux.getProximoNo();
        }
        return aux;
    }

    public T get(int indice){
        return this.getNo(indice).getConteudo();
    }

    public void remove(int indice){
        if(indice>=this.tamanho) throw new IndexOutOfBoundsException("Índice maior que o tamanho da lista");
        No<T> aux=this.cauda;
        if(indice==0){
            this.cauda=this.cauda.getProximoNo();
            this.cabeca.setProximoNo(this.cauda);
        }else if(indice==1){
            this.cauda.setProximoNo(this.cauda.getProximoNo().getProximoNo());
        }else{
            for(int i=0;i<indice-1;i++){
                aux=aux.getProximoNo();
            }
            aux.setProximoNo(aux.getProximoNo().getProximoNo());
        }
        this.tamanho--;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);

        if(this.tamanho==0){
            this.cabeca = novoNo;
            this.cauda=this.cabeca;
            this.cabeca.setProximoNo(cauda);
        }else{
            novoNo.setProximoNo(this.cauda);
            this.cabeca.setProximoNo(novoNo);
            this.cauda=novoNo;
        }
        this.tamanho++;
    }

    @Override
    public String toString(){
        String strRetorno = "";
        
        No<T> aux = this.cauda;
        for(int i =0; i<this.size(); i++){
            strRetorno += "[No{conteudo=" + aux.getConteudo() + "}]--->";
            aux = aux.getProximoNo();
        }

        strRetorno+= this.size()!=0 ? "(Retorna ao inicio)" : "[]";

        return strRetorno;
    }
}
