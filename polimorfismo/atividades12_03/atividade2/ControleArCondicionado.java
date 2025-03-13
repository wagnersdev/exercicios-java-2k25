package polimorfismo.atividades12_03.atividade2;

import java.util.ArrayList;
import java.util.Scanner;

class ControleArCondicionado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArCondicionado> listaArCondicionados = new ArrayList<>();

        int op = 0;
        while (op != 3) {
            System.out.println("==== MENU ====");
            System.out.println("1 - CADASTRAR AR CONDICIONADO");
            System.out.println("2 - LISTAR AR CONDICIONADOS");
            System.out.println("3 - SAIR");
            System.out.println("Digite a opção desejada: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Digite o tipo de ar condicionado (1 - Splinter / 2 - Portátil): ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o código: ");
                    String codigo = sc.nextLine();

                    System.out.println("Digite a marca: ");
                    String marca = sc.nextLine();

                    System.out.println("Digite o BTU: ");
                    String btu = sc.nextLine();

                    System.out.println("Há defeito no aparelho? (S/N): ");
                    String temDefeito = sc.nextLine();
                    String tipoDefeito = "";
                    if (temDefeito.equalsIgnoreCase("S")) {
                        System.out.println("Digite o tipo de defeito: ");
                        tipoDefeito = sc.nextLine();
                    }

                    if (tipo == 1) {
                        System.out.println("Digite o tamanho do Splinter: ");
                        String tamanho = sc.nextLine();

                        System.out.println("Digite os tipos do Splinter: ");
                        String tipos = sc.nextLine();

                        listaArCondicionados.add(new Splinter(codigo, marca, btu, temDefeito, tipoDefeito, tamanho, tipos));
                    } else if (tipo == 2) {
                        System.out.println("Digite a voltagem do Portátil: ");
                        String voltagem = sc.nextLine();

                        System.out.println("Digite a cor do Portátil: ");
                        String cor = sc.nextLine();

                        listaArCondicionados.add(new Portatil(codigo, marca, btu, temDefeito, tipoDefeito, voltagem, cor));
                    } else {
                        System.out.println("Tipo de ar condicionado inválido.");
                    }
                    break;

                case 2:
                    System.out.println("==== RELATÓRIO DE AR CONDICIONADOS ====");
                    if (listaArCondicionados.isEmpty()) {
                        System.out.println("Nenhum ar condicionado cadastrado.");
                    } else {
                        for (ArCondicionado ar : listaArCondicionados) {
                            System.out.println(ar);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        sc.close();
    }
}