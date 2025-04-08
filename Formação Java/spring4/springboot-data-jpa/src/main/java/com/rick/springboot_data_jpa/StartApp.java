package com.rick.springboot_data_jpa;

import com.rick.springboot_data_jpa.model.Usuario;
import com.rick.springboot_data_jpa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UsuarioRepository repository;

    @Override
    public void run(String... args) throws Exception {
        List<Usuario> usuarios = repository.findByNameContainingIgnoreCase("Rick");
        for (Usuario u: usuarios) System.out.println(u);
    }

    private void inserirUsuario(){
        Usuario usuario = new Usuario();
        usuario.setName("Warley");
        usuario.setUsername("lego");
        usuario.setPassword("lego123");
        repository.save(usuario);

        for (Usuario u: repository.findAll()) System.out.println(u);
    }
}
