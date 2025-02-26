package poo.atividade2;

import java.util.ArrayList;
import java.util.Scanner;

public class CamisaApp {
    public static void main(String[] args) {
        ArrayList<Camisa> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op=0;
         while (op!=4) {
            System.out.println("menu");
            System.out.println("1-Cadastrar");
            System.out.println("2- Listar");
            System.out.println("3-Atualizar");
            System.out.println("4-remover");
            System.out.println("5-Sair");
            System.out.println("Escolha a opçao");
            op=sc.nextInt();

            switch (op) {
                case 1:

                    System.out.println("Digite a cor da camisa: ");
                    String cor = sc.next();

                    System.out.println("Digite o tamanho: ");
                    String tamanho=sc.next();

                    System.out.println("Digite a tipo: ");
                    String tipo=sc.next();
                    list.add(new Camisa(cor, tamanho, tipo));
                    
                    break;
                case 2:
                    if(list.isEmpty()){
                        System.out.println("Lista vazia");
                    }else{
                        for(Camisa c:list){
                            System.out.println("\nCor: " + c.getCor() + " Tamanho: " + c.getTamanho() + " Tipo: " + c.getTipo());

                        }
                    }
                case 3:
                    sc.next();
                    if(list.isEmpty()){
                        System.out.println("Lista vazia");
                    }else{
                        System.out.println("Digite o indice da camisa a ser atualizado: ");
                        int Atualizarindice = sc.nextInt();
                        if(Atualizarindice>=0 && Atualizarindice < list.size()){
                            System.out.println("Digite a nova cor: ");
                            String novaCor = sc.next();

                            System.out.println("Digite o novo tamanho: ");
                            String novoTamanho = sc.next();

                            System.out.println("Digite o novo tipo: ");
                            String novoTipo = sc.next();

                            Camisa camisa = list.get(Atualizarindice);
                            camisa.setCor(novaCor);
                            camisa.setTamanho(novoTamanho);
                            camisa.setTipo(novoTipo);
                            System.out.println("Camisa atualizada com sucesso!");
                        }
                    }
                
                case 4:
                    sc.next();
                    if(list.isEmpty()){
                        System.out.println("Lista vazia");
                    }else{
                        System.out.println("Digite o seu indice a ser removido: ");
                        int indice = sc.nextInt();
                        if(indice>=0 && indice < list.size()){
                            list.remove(indice);
                            System.out.println("Camisa removida com sucesso!");
                        }
                    }
                case 5:
                    break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
        }

        sc.close(); 
    }
}
