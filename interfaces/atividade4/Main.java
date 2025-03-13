package interfaces.atividade4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Cachorro> cachorros = new ArrayList<>();
        ArrayList<Gato> gatos = new ArrayList<>();
        int op = 0;
        while (true){
            System.out.println("==== MENU ====");
            System.out.println("1 - CADASTRAR ANIMAL");
            System.out.println("2 - EMITIR SOM DO ANIMAL");
            System.out.println("3 - SAIR DO PROGRAMA");
            System.out.println("Digite uma opção: ");
            op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.println("1 - CACHORRO");
                    System.out.println("2 - GATO");
                    System.out.println("Digite uma opção de animal");
                    int opAnimal = sc.nextInt();
                    sc.nextLine();

                    if(opAnimal == 1) {
                        System.out.println("Nome: ");
                        String nomeCachorro = sc.nextLine();

                        System.out.println("Quanitdade de patas: ");
                        int qtdPatas = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Raça: ");
                        String racaCachorro = sc.nextLine();

                        cachorros.add(new Cachorro(nomeCachorro, qtdPatas, racaCachorro));

                    } else if (opAnimal == 2) {
                        System.out.println("Nome: ");
                        String nomeGato = sc.nextLine();

                        System.out.println("Quantidade de patas: ");
                        int qtdPatasGato = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Cor: ");
                        String corGato = sc.nextLine();

                        gatos.add(new Gato(nomeGato, qtdPatasGato, corGato));

                    }
                    break;

                case 2:
                    System.out.println("==== ANIMAIS CADASTRADOS ====");
                    System.out.println("CACHORROS: ");
                    if (cachorros.isEmpty()) {
                        System.out.println("Nenhum cachorro cadastrado.");
                    } else {
                        for (Cachorro cachorro : cachorros) {
                            System.out.println(cachorro);
                        }
                    }

                    System.out.println("GATOS: ");
                    if (gatos.isEmpty()) {
                        System.out.println("Nenhum gato cadastrado.");
                    } else {
                        for (Gato gato : gatos) {
                            System.out.println(gato);
                        }
                    }

                    System.out.print("Digite o nome do animal para buscar: ");
                    String nomeBusca = sc.nextLine();
                    sc.nextLine();

                    boolean encontrou = false;

                    for (Cachorro cachorroList : cachorros) {
                        if (cachorroList.getNome().equalsIgnoreCase(nomeBusca)) {
                            System.out.println("Cachorro encontrado: " + cachorroList);
                            cachorroList.emitirSom();
                            encontrou = true;
                            break;
                        }
                    }

                    if (!encontrou) {
                        for (Gato gato : gatos) {
                            if (gato.getNome().equalsIgnoreCase(nomeBusca)) {
                                System.out.println("Gato encontrado: " + gato);
                                gato.emitirSom();
                                encontrou = true;
                                break;
                            }
                        }
                    }
                    break;


            }
        }
    }
}
