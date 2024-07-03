package com.elociny.forum.hub.curso;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "cursos")
@Entity(name = "Curso")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Curso {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_curso")
    private String nomeCurso;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    public Curso(DadosCurso dadosCurso) {
        this.nomeCurso = dadosCurso.nomeCurso();
        this.categoria = dadosCurso.categoria();
    }
}
