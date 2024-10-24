package br.com.fiap.chat.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Reacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;

    @ManyToOne
    private Post post;

    @ManyToOne
    private Autor autor;
}
