package com.rick.desafio_padroes_projeto.strategy;

public class Boleto implements FormaPagamento{
    @Override
    public void efetuarPagamento(double valor){
        System.out.println("Pagamento de R$" + valor + "feito via boleto.");
    }

}
