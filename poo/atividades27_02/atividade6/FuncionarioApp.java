package poo.atividades27_02.atividade6;

import java.util.ArrayList;
import java.util.Scanner;

public class FuncionarioApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

        int opcao = 0;

        while (opcao != 3) {
            System.out.println("==== MENU ====");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Listar Funcionários");
            System.out.println("3 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do funcionário: ");
                    String nome = sc.nextLine();

                    System.out.print("Digite o cargo do funcionário: ");
                    String cargo = sc.nextLine();

                    System.out.print("Digite o salário do funcionário: ");
                    double salario = sc.nextDouble();

                    listaFuncionarios.add(new Funcionario(nome, cargo, salario));
                    System.out.println("Funcionário cadastrado com sucesso!\n");
                    break;

                case 2:
                    System.out.println("\n=== LISTA DE FUNCIONÁRIOS ===");
                    if (listaFuncionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado.\n");
                    } else {
                        for (Funcionario f : listaFuncionarios) {
                            System.out.println("Nome: " + f.getNome());
                            System.out.println("Cargo: " + f.getCargo());
                            System.out.printf("Salário: R$ %.2f\n", f.getSalario()); // Formatação direta no printf
                            System.out.println("---------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.\n");
            }
        }
        sc.close();
    }
}
