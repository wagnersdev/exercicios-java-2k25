package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;


public class cadastroTelefonico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            ArrayList<String> nomes = new ArrayList<>();
            ArrayList<Integer> numeros = new ArrayList<>();

            String nomeCadastrado;
            int numeroCadastrado;
            
            int opcao = 0;

            while (opcao != 4) {
                System.out.println("==== Menu ===");
                System.out.println("1 - CADASTRAR");
                System.out.println("2 - LISTAR");
                System.out.println("3 - EXCLUIR");
                System.out.println("4 - SAIR");
                System.out.println("Seleciona a opção: ");
                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        sc.nextLine();
                        
                        System.out.println("Digite seu nome: ");
                        nomeCadastrado = sc.nextLine();

                        System.out.println("Digite seu numero: ");
                        numeroCadastrado = sc.nextInt();

                        nomes.add(nomeCadastrado);
                        numeros.add(numeroCadastrado);
                        break;
                    
                    case 2:
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println("Nome: " + nomes.get(i) + " - Número: " + numeros.get(i));
                        }
                        break;


                    case 3:
                        sc.nextLine();

                        System.out.println("Digite o nome do contato que deseja excluir: ");
                        String contatoExcluido = sc.nextLine();

                        boolean existeNome= nomes.contains(contatoExcluido);

                        if (existeNome) {
                            int index = nomes.indexOf(contatoExcluido);
                            nomes.remove(index);
                            numeros.remove(index);
                            System.out.println("Contato excluido!");
                        }else{
                            System.out.println("Esse contato nao existe");
                        }
                        break;
                    
                    case 4:
                        System.out.println("Finalizado: ");
                        sc.close();
                        break;
                    default:
                        break;
                }

        }
       
        

    }
}