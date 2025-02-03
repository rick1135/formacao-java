package com.list.exemplos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploList2 {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "amarelo"));
            add(new Gato("Jon", 12, "branco"));
        }};
        System.out.println(gatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade=idade;
        this.cor=cor;
    }

    public String getNome(){
        return nome;
    }

    public Integer getIdade(){
        return idade;
    }

    public String getCor(){
        return cor;
    }

    @Override
    public String toString(){
        return "{" +
            "nome='" + nome + '\'' +
            ", idade=" + idade +
            ", cor='" + cor + '\'' +
            '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
    
}