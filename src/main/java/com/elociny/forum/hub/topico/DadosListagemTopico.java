package com.elociny.forum.hub.topico;

import com.elociny.forum.hub.autor.Autor;
import com.elociny.forum.hub.curso.Curso;

import java.time.LocalDateTime;

public record DadosListagemTopico(Long id,
                                  String titulo,
                                  String mensagem,
                                  LocalDateTime dataCriacao,
                                  EstadoTopico estadoTopico,
                                  String autor,
                                  String curso) {
    public DadosListagemTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao(), topico.getEstadoTopico(), topico.getAutor().getNomeAutor(), topico.getCurso().getNomeCurso());
    }
}
