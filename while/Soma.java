import java.util.Scanner;

public class Soma{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int op = 0;
            int n1;
            int n2;

            System.out.println("Digite o primeiro numero: ");
            n1=sc.nextInt();

            System.out.println("Digite o segundo numero: ");
            n2=sc.nextInt();



            while (op!=5) {

                System.out.println("== Menu ===");
                System.out.println("1-SOMAR");
                System.out.println("2-SUBTRAIR");
                System.out.println("3-MULTIPLICAR");
                System.out.println("4-DIVIDIR");
                System.out.println("5-SAIR");
                System.out.println("Escolha opçao: ");
                op = sc.nextInt(); 

                switch (op) {
                    case 1:
                        int soma = n1 + n2;
                        System.out.println("Soma: " + soma);
                    case 2:
                        int subtracao = n1 - n2;
                        System.out.println("Subtração: " + subtracao);

                    case 3:
                        int multiplicacao = n1 * n2;
                        System.out.println("Multiplicação: " + multiplicacao);
                    
                    case 4:
                        int divisao = n1 / n2;
                        System.out.println("Divisao: " + divisao);

                    case 5:
                        System.out.println("FIM");
                        break;
                
                    default:
                        System.out.println("Opçao invalida");
                        break;
                }
            }

        sc.close();
    }
}