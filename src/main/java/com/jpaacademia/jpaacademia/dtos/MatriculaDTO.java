package com.jpaacademia.jpaacademia.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record MatriculaDTO(
        @NotNull(message = "Preencha o campo corretamente.")
        @Positive(message = "O Id do aluno precisa ser positivo.")
        String alunoId
) { }
