package exercicios.ibm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Automovel {

    private List<Carro> carros = new ArrayList<>();
    private List<Caminhao> caminhoes = new ArrayList<>();

}
