package com.map;

import java.util.*;

public class OrdenacaoMap {
    public static void main(String[] args) {
        Map<String, Livro> livros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("o poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 licoes para o seculo 21", 432));
        }};

        for (Map.Entry<String, Livro> livro : livros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        Map<String, Livro> livros2 = new TreeMap<>(livros);
        for (Map.Entry<String, Livro> livro : livros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        Set<Map.Entry<String, Livro>> livros3 = new TreeSet<>(new ComparatorNome());
        livros3.addAll((livros.entrySet()));
        for (Map.Entry<String, Livro> livro : livros3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas){
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome(){
        return nome;
    }

    public Integer getPaginas(){
        return paginas;
    }

    @Override
    public boolean equals(Object o){
        if (this==o) return true;
        if(o==null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override  
    public int hashCode(){
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString(){
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2){
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}