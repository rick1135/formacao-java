package com.rick.desafio_academia_digital.service.impl;

import com.rick.desafio_academia_digital.entity.Aluno;
import com.rick.desafio_academia_digital.entity.AvaliacaoFisica;
import com.rick.desafio_academia_digital.entity.form.AvaliacaoFisicaForm;
import com.rick.desafio_academia_digital.entity.form.AvaliacaoFisicaUpdateForm;
import com.rick.desafio_academia_digital.repository.AlunoRepository;
import com.rick.desafio_academia_digital.repository.AvaliacaoFisicaRepository;
import com.rick.desafio_academia_digital.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {

        return avaliacaoFisicaRepository.findAll();
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}