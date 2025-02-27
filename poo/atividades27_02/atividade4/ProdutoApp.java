package poo.atividades27_02.atividade4;

import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoApp {
    public static void main(String[] args) {
        ArrayList<Produto> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op = 0;

        while (op != 3) {
            System.out.println("===== MENU =====");
            System.out.println("1 - CADASTRAR PRODUTO");
            System.out.println("2 - LISTAR PRODUTO");
            System.out.println("3 - SAIR");
            System.out.print("DIGITE A OPÇÃO DESEJADA: ");
            op = sc.nextInt();
            sc.nextLine(); 

            switch (op) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = sc.nextLine(); 

                    System.out.print("Digite o preço do produto: ");
                    double precoProduto = sc.nextDouble();
                    sc.nextLine(); 

                    System.out.print("Digite a quantidade do produto: ");
                    double quantidadeProduto = sc.nextDouble();
                    sc.nextLine();

                    list.add(new Produto(nomeProduto, precoProduto, quantidadeProduto));
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("Não há nenhum produto cadastrado");
                    } else {
                        for (Produto p : list) {
                            System.out.println("\nNome: " + p.getNome() + " - Preço: " + p.getPreco() + " - Quantidade: " + p.getQuantidade());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        sc.close();
    }
}