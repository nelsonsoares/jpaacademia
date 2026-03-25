package com.jpaacademia.jpaacademia.dtos;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record AvaliacaoFisicaDTO(
        @Positive(message = "O Id do aluno precisa ser positivo.")
        String alunoId,

        @NotNull(message = "Preencha o campo corretamente.")
        @Positive(message = "${validateValue} precisa ser positivo}")
        double peso,

        @NotNull(message = "Preencha o campo corretamente.")
        @Positive(message = "${validateValue} precisa ser positivo}")
        @DecimalMin(value = "150", message = "${validateValue} precisa ser no mínimo {value}")
        double altura
) {
}
