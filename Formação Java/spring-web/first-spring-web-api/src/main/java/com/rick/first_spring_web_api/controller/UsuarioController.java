package com.rick.first_spring_web_api.controller;

import com.rick.first_spring_web_api.model.Usuario;
import com.rick.first_spring_web_api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping()
    public List<Usuario> getUsers(){
        return usuarioRepository.findAll();
    }

    @GetMapping("{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return usuarioRepository.findByUsername(username);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id){
        usuarioRepository.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
