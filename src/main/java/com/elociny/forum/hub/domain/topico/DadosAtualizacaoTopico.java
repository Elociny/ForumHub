package com.elociny.forum.hub.domain.topico;

import com.elociny.forum.hub.domain.autor.Autor;
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
