package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Professor;
import me.dio.academia.digital.entity.form.ProfessorForm;
import me.dio.academia.digital.service.impl.ProfessorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    @Autowired
    private ProfessorServiceImpl service;

    @PostMapping
    public Professor create(@Valid @RequestBody ProfessorForm form) {
        return service.create(form);
    }


}
