package br.com.fiap.chat.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PostDTO {

    private Long id;
    private String conteudo;
    private Date dataCriacao;
    private AutorDTO autor;
    private List<ComentarioDTO> comentarios;
    private List<ReacaoDTO> reacoes;
}


