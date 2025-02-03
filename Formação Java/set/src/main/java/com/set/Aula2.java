package com.set;

import java.util.*;

public class Aula2 {
    public static void main(String[] args) {
        System.out.println("Ordem aleatoria");
        Set<Serie> series = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 50));
            add(new Serie("HIMYM", "comedia", 40));
        }};

        for (Serie serie : series) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("Ordem de insercao");
        Set<Serie> series2 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("HIMYM", "comedia", 60));
        }};

        for (Serie serie : series2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("Ordem natural (TempoEpisodio)");
        Set<Serie> series3 = new TreeSet<>(series);
        System.out.println(series3);
    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio){
        this.nome=nome;
        this.genero=genero;
        this.tempoEpisodio=tempoEpisodio;
    }

    public String getNome(){
        return nome;
    }

    public String getGenero(){
        return genero;
    }

    public Integer getTempoEpisodio(){
        return tempoEpisodio;
    }

    @Override
    public String toString(){
        return "{" +
            "nome='" + nome + '\'' +
            ", genero='" + genero + '\'' +
            ", tempoEpisodio=" + tempoEpisodio +
            '}';
    }

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie){
        return Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
    }
}