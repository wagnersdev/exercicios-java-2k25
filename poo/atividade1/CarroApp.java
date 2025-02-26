package poo.atividade1;

import java.util.ArrayList;
import java.util.Scanner;

public class CarroApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Carro> list = new ArrayList<>();

        int op = 0;

        while (op!=4) {
            System.out.println("menu");
            System.out.println("1-Cadastrar");
            System.out.println("2- Listar");
            System.out.println("3-Atualizar");
            System.out.println("4-Remover");
            System.out.println("Escolha a opçao");
            op=sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite a marca: ");
                    String marca=sc.next();

                    System.out.println("Digite o modelo: ");
                    String modelo=sc.next();

                    System.out.println("Digite o ano de fabricação: ");
                    int anoFabricacao=sc.nextInt();

                    list.add(new Carro(marca, modelo, anoFabricacao));
                    
                    break;
                case 2:
                    if(list.isEmpty()){
                        System.out.println("Lista vazia");
                    }else{
                        for(Carro c:list){
                            System.out.println("\nMarca: " + c.getMarca() + " Modelo: " + c.getModelo() + " Ano Fabricação: " + c.getAnoFabricacao());

                        }
                    }
                case 3:
                    sc.next();
                    if(list.isEmpty()){
                        System.out.println("Lista vazia");
                    }else{
                        System.out.println("Digite o indice do carro a ser atualizado: ");
                        int Atualizarindice = sc.nextInt();
                        if(Atualizarindice>=0 && Atualizarindice < list.size()){
                            System.out.println("Digite a nova marca: ");
                            String novaMarca = sc.next();

                            System.out.println("Digite o novo modelo: ");
                            String novoModelo= sc.next();

                            System.out.println("Digite o novo ano de fabricação: ");
                            int novoAnoFabricacao = sc.nextInt();

                            Carro carro = list.get(Atualizarindice);
                            carro.setMarca(novaMarca);
                            carro.setModelo(novoModelo);
                            carro.setAnoFabricacao(novoAnoFabricacao);
                            System.out.println("Carro atualizado com sucesso!");
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
                            System.out.println("carro removido com sucesso!");
                        }
                    }
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
        }

        sc.close(); 
    }
}
