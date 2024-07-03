package com.elociny.forum.hub.topico;

import com.elociny.forum.hub.autor.Autor;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosAtualizacaoTopico(@NotNull
                                     Long id,
                                     String titulo,
                                     String mensagem,
                                     LocalDateTime dataCriacao,
                                     EstadoTopico estadoTopico,
                                     Autor autor) {
}