package com.map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> carros = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carros);

        carros.put("gol", 15.2);
        System.out.println(carros);

        System.out.println("O modelo tucson esta listado?: " + carros.containsKey("tucson"));

        System.out.println("Modelos listados: " + carros.keySet());
        System.out.println("Consumo dos carros: " + carros.values());

        Double consumoEfic = Collections.max(carros.values());
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloEficiente = "";
        for(Map.Entry<String, Double> entry: entries){
            if(entry.getValue().equals(consumoEfic)) modeloEficiente = entry.getKey();
        }
        System.out.println("Modelo mais economico: " + modeloEficiente + ", consumo de: " + consumoEfic);
        

        Double consumoMenosEfic = Collections.min(carros.values());
        String modeloMenosEfic = "";
        for (Map.Entry<String,Double> entry : entries) {
            if(entry.getValue().equals(consumoMenosEfic)) modeloMenosEfic = entry.getKey();
        }
        System.out.println("Modelo menos economico: " + modeloMenosEfic + ", consumo de: " + consumoMenosEfic);

        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma+=iterator.next();
        }
        System.out.println("Soma dos consumos:" + soma);

        Iterator<Double> iterator2 = carros.values().iterator();
        while (iterator2.hasNext()) {
            if(iterator2.next().equals(15.6)) iterator2.remove();
        }
        System.out.println("Conjunto apos remocao dos modelos com consumo igual 15.6: " + carros);
    }
}