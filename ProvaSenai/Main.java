package ProvaSenai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aviao aviao = new Aviao();

        while (true) {
            System.out.println("\n ======== Menu======= ");
            System.out.println("1 - Registrar o número dos aviões e assentos");
            System.out.println("2 - Exibir aviões e assentos disponíveis");
            System.out.println("3 - Reservar passagem aérea");
            System.out.println("4 - Consultar reservas por avião");
            System.out.println("5 - Consultar reservas por passageiro");
            System.out.println("6 - Encerrar");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    aviao.registrarNumeroAviao();
                    break;
                case 2:
                    aviao.exibirAssentos();
                    break;
                case 3:
                    aviao.reservarPassagem();
                    break;
                case 4:
                    aviao.consultarPorAviao();
                    break;
                case 5:
                    aviao.consultarPorPassageiro();
                    break;
                case 6:
                    System.out.println("Encerrando o sistema...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }
        }
    }
}
