package dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {
    private  Long id;
    private  String conteudo;
    private Date dataCriacao;
    private  Long autor;
}
