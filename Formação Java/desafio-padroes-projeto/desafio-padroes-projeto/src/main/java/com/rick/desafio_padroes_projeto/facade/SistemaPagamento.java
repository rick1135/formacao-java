package com.rick.desafio_padroes_projeto.facade;

import com.rick.desafio_padroes_projeto.strategy.FormaPagamento;

public class SistemaPagamento {
    private FormaPagamento formaPagamento;

    public void escolherMetodoPagamento(FormaPagamento formaPagamento){
        this.formaPagamento = formaPagamento;
    }

    public void realizarPagamento(double valor){
        if(formaPagamento!=null) formaPagamento.efetuarPagamento(valor);
        else System.out.println("Nenhum método de pagamento informado");
    }

}
