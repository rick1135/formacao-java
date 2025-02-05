package com.map;

import java.util.*;

public class Exerc {
    public static void main(String[] args) {
        Map<String, Double> estados = new HashMap<>(){{
            put("PE", 9616.621);
            put("AL", 3351.543);
            put("CE", 9187.103);
            put("RN", 3534.265);
        }};
        estados.put("RN", 3534.165);
        System.out.println(estados);
        if(estados.containsKey("PB")){
            System.out.println("O estado PB esta contido no dicionario");
        }else{
            estados.put("PB", 4039.277);
            System.out.println("Estado PB adicionado!");
            System.out.println(estados);
        }
        Double populacaoPE = estados.get("PE");
        if(populacaoPE!=null) System.out.println("Populacao do estado PE: " + populacaoPE);
        else System.out.println("Estado nao encontrado!");

        System.out.println("-");

        Map<String, Double> estados2 = new LinkedHashMap<>(){{
            put("PE", 9616.621);
            put("AL", 3351.543);
            put("CE", 9187.103);
            put("RN", 3534.265);
        }};
        for (Map.Entry<String, Double> estado : estados2.entrySet()) {
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println("-");

        Map<String, Double> estados3 = new TreeMap<>(estados);
        for (Map.Entry<String, Double> estado : estados3.entrySet()) {
            System.out.println(estado.getKey() + " - " + estado.getValue());
        }

        System.out.println("-");

        Double popMenorEst = Collections.min(estados.values());
        Set<Map.Entry<String, Double>> estados4 = estados.entrySet();
        String menorEst = "";
        for (Map.Entry<String, Double> entry : estados4) {
            if(entry.getValue().equals(popMenorEst)) menorEst = entry.getKey();
        }
        System.out.println("Menor estado: " + menorEst + " populacao: " + popMenorEst);

        System.out.println("-");

        Double popMaiorEst = Collections.max(estados.values());
        Set<Map.Entry<String, Double>> estados5 = estados.entrySet();
        String maiorEst = "";
        for (Map.Entry<String, Double> entry : estados5) {
            if(entry.getValue().equals(popMaiorEst)) maiorEst = entry.getKey();
        }
        System.out.println("Maior estado: " + maiorEst + " populacao: " + popMaiorEst);
        
        System.out.println(("-"));

        Double soma = 0d;
        Iterator<Double> iterator = estados.values().iterator();
        while(iterator.hasNext()){
            soma+=iterator.next();
        }
        System.out.println("soma das populacoes: " + soma);
        System.out.println("media das populacoes: " + soma/(estados.size()));

        Iterator<Double> iterator2 = estados.values().iterator();
        while(iterator2.hasNext()){
            if(iterator2.next()< 4000.000) iterator2.remove();
        }
        System.out.println("conjunto apos remover estados com populacao menor que 4mi: " + estados);
    }
}

class Estado {
    private String sigla;
    private Double populacao;

    public Estado(String sigla, Double populacao){
        this.sigla = sigla;
        this.populacao = populacao;
    }

    public String getSigla(){
        return sigla;
    }

    public Double getPopulacao(){
        return populacao;
    }

    @Override
    public String toString(){
        return "Estado{" +
                "sigla='" + sigla + '\'' +
                ", populacao=" + populacao +
                '}';
    }
}