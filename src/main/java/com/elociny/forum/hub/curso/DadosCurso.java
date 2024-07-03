package com.elociny.forum.hub.curso;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCurso(@NotBlank
                         String nomeCurso,
                         @NotNull
                         Categoria categoria) {
}
