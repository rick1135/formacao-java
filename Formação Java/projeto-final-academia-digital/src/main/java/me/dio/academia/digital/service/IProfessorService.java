package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.Professor;
import me.dio.academia.digital.entity.form.ProfessorForm;
import me.dio.academia.digital.entity.form.ProfessorUpdateForm;

import java.util.List;

public interface IProfessorService {
    Professor create(ProfessorForm form);
    Professor get(Long id);
    List<Professor> getAll();
    Professor update(Long id, ProfessorUpdateForm formUpdate);
    void delete(Long id);
    List<Professor> findByNomeContaining(String nomeProfessor);
    List<AvaliacaoFisica> getAvaliacoesFisicas(Long idProfessor);
}
