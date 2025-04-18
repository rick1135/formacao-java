package com.rick.desafio_padroes_projeto.strategy;

public class CartaoCredito implements FormaPagamento{
    @Override
    public void efetuarPagamento(double valor){
        System.out.println("Pagamento de R$" + valor + "realizado com cartão de crédito");
    }
}
