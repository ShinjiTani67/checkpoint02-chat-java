package dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReacaoDTO {
    private  Long id;
    private  String tipo;
    private  Long autor;
    private  Long post;
}
