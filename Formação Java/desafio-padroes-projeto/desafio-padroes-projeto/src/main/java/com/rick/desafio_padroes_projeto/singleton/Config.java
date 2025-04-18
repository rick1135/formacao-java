package com.rick.desafio_padroes_projeto;

public class Config {
    private static Config instance;
    private double taxa;

    private Config(){
        this.taxa=0.05;
    }

    public static Config getInstance() {
        if(instance==null) instance = new Config();
        return instance;
    }

    public double getTaxa() {
        return taxa;
    }
}
