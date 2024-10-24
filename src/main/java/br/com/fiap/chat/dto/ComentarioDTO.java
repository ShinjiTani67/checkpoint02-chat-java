package br.com.fiap.chat.dto;

import lombok.Data;

@Data
public class ComentarioDTO {

    private Long id;
    private String texto;
    private AutorDTO autor;
}
