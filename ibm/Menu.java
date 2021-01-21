package exercicios.ibm;

import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class Menu {
    Scanner sc = new Scanner(System.in);
    Integer escolha;
    Boolean sair = Boolean.FALSE;

    Concessionaria concessionaria = new Concessionaria();


    public void abrirMenu() {


        while (Boolean.FALSE.equals(sair)) {
            System.out.println("----------------Cadastro de automóveis----------------");
            System.out.println("               Escolha uma das opções:                ");
            System.out.println("                    1 - Cadastro                      ");
            System.out.println("                    2 - Consulta                      ");
            System.out.println("                    3 - Sair                          ");

            escolha = sc.nextInt();


            switch (escolha) {
                case 1:
                    System.out.println("Escolha: 1.Carro 2.Caminhão");

                    escolha = sc.nextInt();
                    if (escolha == 1) {
                        concessionaria.cadastrarCarro();
                    }else if (escolha == 2) {
                        concessionaria.cadastrarCaminhao();
                    }

                    break;
                case 2:System.out.println("Escolha: 1.Carro 2.Caminhão");

                    escolha = sc.nextInt();
                    if (escolha == 1) {
                        concessionaria.listarCarro();
                    }else if (escolha == 2) {
                        concessionaria.listarCaminhao();
                    }
                    break;

                case 3:
                    sair = Boolean.TRUE;
                    break;

            }
        }


    }

}



