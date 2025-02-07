package com.listaduplamenteencadeada;

public class ListaDuplamenteEncadeada<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo=null;
        this.tamanhoLista=0;
    }

    public int size(){
        return this.tamanhoLista;
    } 

    private No<T> getNo(int index){
        No<T> aux = primeiroNo;

        for(int i=0; (i<index) && (aux!=null); i++){
            aux=aux.getProximoNo();
        }

        return aux;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void add(T counteudo){
        No<T> novoNo = new No<>(counteudo);

        novoNo.setProximoNo(null);
        novoNo.setNoAnterior(ultimoNo);
        if (primeiroNo==null) {
            primeiroNo=novoNo;
        }
        if (ultimoNo!=null) {
            ultimoNo=novoNo;
        }
        ultimoNo=novoNo;
        tamanhoLista++;
        
    }

    public void add(int index, T conteudo){
        No<T> aux = getNo(index);
        No<T> novoNo = new No<>(conteudo);
        novoNo.setProximoNo(aux);

        if(novoNo.getProximoNo()!=null){
            novoNo.setNoAnterior(aux.getNoAnterior());
            novoNo.getProximoNo().setNoAnterior(novoNo);
        }

        if(index==0) primeiroNo=novoNo;
        else novoNo.getNoAnterior().setProximoNo(novoNo);
        tamanhoLista++;
    }

    public void remove(int index){
        if(index==0){
            primeiroNo=primeiroNo.getProximoNo();
            if(primeiroNo!=null) primeiroNo.setNoAnterior(null);
        }else{
            No<T> aux = getNo(index);
            aux.getNoAnterior().setProximoNo(aux.getProximoNo());
            if(aux != ultimoNo){
                aux.getProximoNo().setNoAnterior(aux.getNoAnterior());
            }else{
                ultimoNo=aux;
            }
        }
        this.tamanhoLista--;
    }

    @Override
    public String toString(){
        String retorno = "";
        No<T> aux = primeiroNo;

        for(int i = 0; i < this.size(); i++){
            retorno += "[No{conteudo=" + aux.getConteudo() + " esquerda:" + aux.getNoAnterior() + " direita: " + aux.getProximoNo() + "}]-->";
            aux = aux.getProximoNo();
        }

        retorno += "null";
        return retorno;
    }
}
