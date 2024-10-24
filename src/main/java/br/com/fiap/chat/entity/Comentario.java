package br.com.fiap.chat.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String texto;

    @ManyToOne
    private Post post;

    @ManyToOne
    private Autor autor;
}

