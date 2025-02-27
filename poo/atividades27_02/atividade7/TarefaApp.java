package poo.atividades27_02.atividade7;

import java.util.ArrayList;
import java.util.Scanner;

public class TarefaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Tarefa> listaTarefas = new ArrayList<>();
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Listar Tarefas");
            System.out.println("3 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = sc.nextLine();

                    System.out.print("A tarefa está concluída? (1 - Sim / 2 - Não): ");
                    int status = sc.nextInt();
                    boolean concluida = (status == 1);

                    listaTarefas.add(new Tarefa(descricao, concluida));
                    System.out.println("Tarefa adicionada com sucesso!\n");
                    break;

                case 2:
                    System.out.println("\n=== LISTA DE TAREFAS ===");
                    if (listaTarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        for (Tarefa t : listaTarefas) {
                            String statusTarefa = t.isConcluida() ? "[X] Concluído" : "[ ] Pendente";
                            System.out.println(statusTarefa + " - " + t.getDescricao());
                        }
                    }
                    System.out.println("---------------------------");
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
