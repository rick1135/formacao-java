package com.rick.desafio_padroes_projeto;

import com.rick.desafio_padroes_projeto.facade.SistemaPagamento;
import com.rick.desafio_padroes_projeto.strategy.Boleto;
import com.rick.desafio_padroes_projeto.strategy.CartaoCredito;

public class Main {
    public static void main(String[] args) {
        SistemaPagamento sistemaPagamento = new SistemaPagamento();

        sistemaPagamento.escolherMetodoPagamento(new CartaoCredito());
        sistemaPagamento.realizarPagamento(100.00);

        sistemaPagamento.escolherMetodoPagamento(new Boleto());
        sistemaPagamento.realizarPagamento(50.00);
    }
}
