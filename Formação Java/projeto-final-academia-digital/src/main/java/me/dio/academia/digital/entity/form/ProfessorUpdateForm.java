package me.dio.academia.digital.entity.form;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ProfessorUpdateForm {
    private String nome;

    private String bairro;

    private LocalDate dataDeNascimento;
}
