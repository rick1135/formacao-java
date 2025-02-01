package com.listaencadeada;

public class ListaEncadeada<T> {
    No<T> cabeca;

    public ListaEncadeada() {
        this.cabeca = null;
    }

    public boolean isEmpty() {
        return cabeca == null ? true : false;
    }

    public int size(){
        int tamanho = 0;
        No<T> aux = cabeca;
        while(true){
            if(aux == null) break;
            tamanho++;
            if(aux.getProximoNo() == null) break;
            aux = aux.getProximoNo();
        }
        return tamanho;
    }

    public void add(T counteudo){
        No<T> novoNo = new No<>(counteudo);

        if(this.isEmpty()){
            cabeca = novoNo;
            return;
        }

        No<T> aux = cabeca;
        for(int i = 0; i < this.size() - 1; i++){
            aux = aux.getProximoNo();
        }
        aux.setProximoNo(novoNo);
    }

    private No<T> getNo(int index){
        if(index >= this.size()){
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta lista vai até o índice " + (this.size() - 1) + ".");
        }

        No<T> aux = cabeca;
        No<T> noRetorno = null;

        for(int i = 0; i <= index; i++){
            noRetorno = aux;
            aux = aux.getProximoNo();
        }

        return noRetorno;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public T remove(int index){
        No<T> noPivo = this.getNo(index);

        if(index == 0){
            cabeca = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }

        No<T> noAnterior = this.getNo(index - 1);
        noAnterior.setProximoNo(noPivo.getProximoNo());
        return noPivo.getConteudo();        
    }

    @Override
    public String toString(){
        String retorno = "";
        No<T> aux = cabeca;

        for(int i = 0; i < this.size(); i++){
            retorno += "[No{conteudo=" + aux.getConteudo() + "}]-->";
            aux = aux.getProximoNo();
        }

        retorno += "null";
        return retorno;
    }
}   
