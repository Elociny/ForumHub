package com.elociny.forum.hub.domain.topico;

import com.elociny.forum.hub.domain.autor.Autor;
import com.elociny.forum.hub.domain.curso.Curso;

import java.time.LocalDateTime;

public record DadosDetalhamentoTopico(Long id,
                                      String titulo,
                                      String mensagem,
                                      LocalDateTime dataCriacao,
                                      EstadoTopico estadoTopico,
                                      Autor autor,
                                      Curso curso) {

    public DadosDetalhamentoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao(), topico.getEstadoTopico(), topico.getAutor(), topico.getCurso());
    }
}
