package com.elociny.forum.hub.domain.topico;

import com.elociny.forum.hub.domain.autor.DadosAutor;
import com.elociny.forum.hub.domain.curso.DadosCurso;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosCadastroTopico(@NotBlank
                                  String titulo,
                                  @NotBlank
                                  String mensagem,
                                  @NotNull
                                  LocalDateTime dataCriacao,
                                  @NotNull
                                  EstadoTopico estadoTopico,
                                  @NotNull
                                  @Valid
                                  DadosAutor autor,
                                  @NotNull
                                  @Valid
                                  DadosCurso curso) {
}