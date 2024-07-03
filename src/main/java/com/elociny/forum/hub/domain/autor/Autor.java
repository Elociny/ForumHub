package com.elociny.forum.hub.domain.autor;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "autores")
@Entity(name = "Autor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Autor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_autor")
    private String nomeAutor;

    private String email;
    private String senha;

    public Autor(DadosAutor dadosAutor) {
        this.nomeAutor = dadosAutor.nomeAutor();
        this.email = dadosAutor.email();
        this.senha = dadosAutor.senha();
    }

    public void atualizarInformacoes(Autor dados) {
        if (dados.nomeAutor != null) {
            this.nomeAutor = dados.nomeAutor;
        }
        if (dados.email != null) {
            this.email = dados.email;
        }
        if (dados.senha != null) {
            this.senha = dados.senha;
        }
    }
}
