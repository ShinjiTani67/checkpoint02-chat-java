package br.com.fiap.chat.entity;

import br.com.fiap.chat.enums.Status;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    @Enumerated(EnumType.STRING)
    private Status status;
}

