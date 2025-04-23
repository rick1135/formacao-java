package com.rick.desafio_academia_digital.service;

import com.rick.desafio_academia_digital.entity.Matricula;
import com.rick.desafio_academia_digital.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {
    Matricula create(MatriculaForm form);

    Matricula get(Long id);

    List<Matricula> getAll();

    void delete(Long id);
}
