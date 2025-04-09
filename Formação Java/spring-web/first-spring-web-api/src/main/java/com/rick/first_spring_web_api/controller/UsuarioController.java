package com.rick.first_spring_web_api.controller;

import com.rick.first_spring_web_api.model.Usuario;
import com.rick.first_spring_web_api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;

    @PostMapping()
    public void post(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
    @PutMapping()
    public void put(@RequestBody Usuario usuario){
        repository.update(usuario);
    }
    @GetMapping()
    public List<Usuario> getAll(){
        return repository.listAll();
    }
    @GetMapping("{id}")
    public Usuario getOne(@PathVariable("id") Integer id){
        return repository.finById(id);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.remove(id);
    }
}