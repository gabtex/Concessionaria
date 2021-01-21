package exercicios.ibm;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Caminhao extends Automovel {
    private String marca;
    private String modelo;
    private Integer ano;
    private String cor;
}
