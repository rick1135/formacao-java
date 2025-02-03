package com.list.exercicio;

import java.util.*;

public class Exerc1 {    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();
        List<String> meses = Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho");
        System.out.printf("Informe a temperatura media dos seis primeiros meses:\n");
        for(int i=0; i<6; i++){
            temperaturas.add(ler.nextDouble());     
        }
        Double mediaSemestral = 0.0;
        for (Double temperatura : temperaturas) {
            mediaSemestral+=temperatura;
        }
        mediaSemestral = mediaSemestral/6;
        System.out.println("Media semestral= " + mediaSemestral);

        System.out.println("Temperaturas acima da média semestral: ");
        Iterator<Double> iterator = temperaturas.iterator();
        int index = 0;
        while(iterator.hasNext()){
            double temp = iterator.next();
            if(temp>mediaSemestral) System.out.println(meses.get(index) + ": " + temp);
            index++;
        }


        ler.close();
    }
}
