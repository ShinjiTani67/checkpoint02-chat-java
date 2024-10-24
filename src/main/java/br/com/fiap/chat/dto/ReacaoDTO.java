package br.com.fiap.chat.dto;

import lombok.Data;

@Data
public class ReacaoDTO {

    private Long id;
    private String tipo;
    private AutorDTO autor;
}

