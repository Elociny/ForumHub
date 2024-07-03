package com.elociny.forum.hub.domain.autor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DadosAutor(@NotBlank
                         String nomeAutor,
                         @NotBlank
                         @Email
                         String email,
                         @NotBlank
                         String senha) {
}
