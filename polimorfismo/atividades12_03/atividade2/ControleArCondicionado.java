package polimorfismo.atividades12_03.atividade2;

import java.util.ArrayList;
import java.util.Scanner;

class ControleArCondicionado{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArCondicionado> list = new ArrayList<>();

        int op = 0;
        while (op != 3) {
            System.out.println("====MENU====");
            System.out.println("1 - CADSTRAR");
            System.out.println("2 - LISTAR");
            System.out.println("3 - SAIR");
            System.out.println("Digite a opção desejada: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    sc.nextLine();

                    System.out.println("Digite o codigo");
                    String codigo = sc.nextLine();

                    System.out.println("Digite a marca: ");
                    String marca = sc.nextLine();
        
                    System.out.println("Digite o BTU");
                    String btu = sc.nextLine();

                    list.add(new ArCondicionado(codigo, marca, btu));
                    break;
                case 2:
                    for(ArCondicionado l: list){
                        System.out.println(l);
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    break;
            }
    
        }

   }
}