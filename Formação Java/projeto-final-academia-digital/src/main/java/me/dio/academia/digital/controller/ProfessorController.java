package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.Professor;
import me.dio.academia.digital.entity.form.ProfessorForm;
import me.dio.academia.digital.entity.form.ProfessorUpdateForm;
import me.dio.academia.digital.service.impl.ProfessorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    @Autowired
    private ProfessorServiceImpl service;

    @PostMapping
    public Professor create(@Valid @RequestBody ProfessorForm form) {
        return service.create(form);
    }

    @GetMapping()
    public List<Professor> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Professor get(@PathVariable Long id) {
        return service.get(id);
    }

    @PutMapping("/{id}")
    public Professor update(@PathVariable Long id, @Valid @RequestBody ProfessorUpdateForm form) {
        return service.update(id, form);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("/search")
    public List<Professor> findByNomeContaining(@RequestParam String nomeProfessor) {
        if (nomeProfessor == null || nomeProfessor.isEmpty()) {
            return service.getAll();
        } else {
            return service.findByNomeContaining(nomeProfessor);
        }
    }

    @GetMapping("/{id}/avaliacoes-fisicas")
    public List<AvaliacaoFisica> getAvaliacoesFisicas(@PathVariable Long id) {
        return service.getAvaliacoesFisicas(id);
    }

}
