package com.rick.springboot_value.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SistemaMensagem implements CommandLineRunner {
    @Value("${name:NoReply-Rick}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones;

    @Override
    public void run(String... args) throws Exception{
        System.out.println("Mensagem enviada por: " + nome + "\nEmail: " + email + "\nCom telefone: " + telefones);
        System.out.println("Seu cadastro foi aprovado");
    }
}
