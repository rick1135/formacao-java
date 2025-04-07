package com.rick.springboot_data_jpa;

import com.rick.springboot_data_jpa.model.Usuario;
import com.rick.springboot_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setName("Rick");
        usuario.setUsername("rick1135");
        usuario.setPassword("rick123");

        repository.save(usuario);

        for(Usuario u: repository.findAll()){
            System.out.println(u);
        }
    }
}
