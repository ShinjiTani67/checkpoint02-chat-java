package br.com.fiap.chat.dto;

import br.com.fiap.chat.entity.Autor;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class ConexaoDTO {
    private Long id;
    private Autor autor;
    private Autor conectado;
}
