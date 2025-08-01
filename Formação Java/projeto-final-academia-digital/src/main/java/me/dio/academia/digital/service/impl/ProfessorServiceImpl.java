package me.dio.academia.digital.service.impl;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.Professor;
import me.dio.academia.digital.entity.form.ProfessorForm;
import me.dio.academia.digital.entity.form.ProfessorUpdateForm;
import me.dio.academia.digital.repository.ProfessorRepository;
import me.dio.academia.digital.service.IProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorServiceImpl implements IProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public Professor create(ProfessorForm form) {
        Professor professor = new Professor();
        professor.setNome(form.getNome());
        professor.setCpf(form.getCpf());
        professor.setBairro(form.getBairro());
        professor.setDataDeNascimento(form.getDataDeNascimento());

        return professorRepository.save(professor);
    }

    @Override
    public Professor get(Long id) {
        return professorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Professor não encontrado com o id: " + id));
    }

    @Override
    public List<Professor> getAll() {
        return professorRepository.findAll();
    }

    @Override
    public Professor update(Long id, ProfessorUpdateForm formUpdate) {
        Professor professor = professorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Professor não encontrado com o id: " + id));
        professor.setNome(formUpdate.getNome());
        professor.setBairro(formUpdate.getBairro());
        professor.setDataDeNascimento(formUpdate.getDataDeNascimento());

        return professorRepository.save(professor);
    }

    @Override
    public void delete(Long id) {
        Professor professor = professorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Professor não encontrado com o id: " + id));

        if (professor != null) {
            professorRepository.delete(professor);
        }
    }

    @Override
    public List<Professor> findByNomeContaining(String nomeProfessor) {
        if (nomeProfessor == null || nomeProfessor.isEmpty()) {
            return professorRepository.findAll();
        } else {
            return professorRepository.findByNomeContaining(nomeProfessor);
        }
    }

    @Override
    public List<AvaliacaoFisica> getAvaliacoesFisicas(Long idProfessor) {
        Professor professor = professorRepository.findById(idProfessor)
                .orElseThrow(() -> new RuntimeException("Professor não encontrado com o id: " + idProfessor));
        return professor.getAvaliacaoFisicas();
    }
}
