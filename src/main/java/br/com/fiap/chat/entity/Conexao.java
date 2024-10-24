package br.com.fiap.chat.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Conexao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Autor autor;

    @ManyToOne
    private Autor conectado;
}


