package exercicios.ibm;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Scanner;

@Getter
@Setter
@NoArgsConstructor
public class Concessionaria implements Ifuncionalidades {
    Scanner sc = new Scanner(System.in);

    Automovel automovel = new Automovel();

    @Override
    public void cadastrarCarro() {
        String marca;
        String modelo;
        Integer ano ;
        String cor ;



        System.out.println("Digite a marca do veículo: ");
        marca = sc.next();

        System.out.println("Digite o modelo do veículo: ");
        modelo = sc.next();

        System.out.println("Digite o ano do veículo: ");
        ano = sc.nextInt();

        System.out.println("Digite a cor do veículo: ");
        cor = sc.next();

        Carro carro = new Carro(marca, modelo, ano, cor);

        this.automovel.getCarros().add(carro);
    }

    @Override
    public void cadastrarCaminhao() {
        String marca;
        String modelo;
        Integer ano;
        String cor;


        System.out.println("Digite a marca do veículo: ");
        marca = sc.next();

        System.out.println("Digite o modelo do veículo: ");
        modelo = sc.next();

        System.out.println("Digite o ano do veículo: ");
        ano = sc.nextInt();

        System.out.println("Digite a cor do veículo: ");
        cor = sc.next();

        Caminhao caminhao = new Caminhao(marca, modelo, ano, cor);

        this.automovel.getCaminhoes().add(caminhao);


    }

    @Override
    public void listarCarro() {
        for (Carro c : this.automovel.getCarros()) {
            System.out.println(c);
        }
    }

    @Override
    public void listarCaminhao() {
        for (Caminhao c : this.automovel.getCaminhoes()) {
            System.out.println(c);

        }
    }

}





