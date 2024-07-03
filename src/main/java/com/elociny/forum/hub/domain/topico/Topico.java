package com.elociny.forum.hub.domain.topico;

import com.elociny.forum.hub.domain.autor.Autor;
import com.elociny.forum.hub.domain.curso.Curso;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensagem;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @Column(name = "estado_topico")
    @Enumerated(EnumType.STRING)
    private EstadoTopico estadoTopico;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "autor_id")
    private Autor autor;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "curso_id")
    private Curso curso;

    public Topico(DadosCadastroTopico dados) {
        this.titulo = dados.titulo();
        this.mensagem = dados.mensagem();
        this.dataCriacao = dados.dataCriacao();
        this.estadoTopico = dados.estadoTopico();
        this.autor = new Autor(dados.autor());
        this.curso = new Curso(dados.curso());
    }

    public void atualizarInformacoes(DadosAtualizacaoTopico dados) {
        if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }
        if (dados.mensagem() != null) {
            this.mensagem = dados.mensagem();
        }
        if (dados.dataCriacao() != null) {
            this.dataCriacao = dados.dataCriacao();
        }
        if (dados.estadoTopico() != null) {
            this.estadoTopico = dados.estadoTopico();
        }
        if (dados.autor() != null) {
            this.autor.atualizarInformacoes(dados.autor());
        }
    }
}
