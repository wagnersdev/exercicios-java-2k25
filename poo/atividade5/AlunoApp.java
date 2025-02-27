package poo.atividade5;
import java.util.ArrayList;
import java.util.Scanner;

public class AlunoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> listAlunos = new ArrayList<>();
        int op = 0;

        while (op != 3) {
            System.out.println("==== MENU ====");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - LISTAR");
            System.out.println("3 - SAIR");
            System.out.print("DIGITE A OPÇÃO DESEJADA: ");
            op = sc.nextInt();

            switch (op) {
                case 1: 
                    sc.nextLine();
                    System.out.print("Digite o nome do aluno: ");
                    String nomeAluno = sc.nextLine();
                    
                    ArrayList<Double> notasAluno = new ArrayList<>();
                    
                    for (int i = 0; i < 3; i++) { 
                        System.out.print("Digite a " + (i + 1) + "ª nota do aluno: ");
                        notasAluno.add(sc.nextDouble());
                    }

                    listAlunos.add(new Aluno(nomeAluno, notasAluno));
                    System.out.println("Aluno cadastrado com sucesso!\n");
                    break;

                case 2:
                    System.out.println("\n=== LISTA DE ALUNOS ===");
                    if (listAlunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.\n");
                    } else {
                        
                        for (Aluno p : listAlunos) {
                            double soma = 0;
                            for (double nota : p.getNotas()) {
                                soma += nota;
                            }
                            double media = soma / p.getNotas().size();
                            
                            System.out.println("Aluno: " + p.getNome());
                            System.out.print("Media: " + media);
                           
                            System.out.println("\n------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}