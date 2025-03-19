package TratamentoDeExcecoes.Atividades;

import java.util.Scanner;

public class DivisaoException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um numero: ");
            int num = sc.nextInt();

            System.out.println("Digite outro número: ");
            int num2 = sc.nextInt();

            int resultado = num / num2;

            System.out.println("Resultado: " + resultado);
        }catch (ArithmeticException e){
            System.out.println("Erro! não é possivel dividir por 0!");

        }finally {
            System.out.println("Programa finalizado...");
        }
    }
}
