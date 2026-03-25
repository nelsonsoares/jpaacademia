package com.jpaacademia.jpaacademia.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record AlunoDTO(
        @NotEmpty(message = "Preencha o campo corretamente.")
        @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
        String nome,

        @NotBlank(message = "Preencha o campo corretamente.")
        String cpf,

        @NotEmpty(message = "Preencha o campo corretamente.")
        @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
        String bairro,

        @NotNull(message = "Preencha o campo corretamente.")
        @Past(message = "Data '${validatedValue}' é inválida.")
        @JsonFormat(pattern = "dd/MM/yyyy")
        LocalDate dataNascimento
) {
}
