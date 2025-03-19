package TratamentoDeExcecoes.Atividades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroDeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();

            if(idade <= 0){
                System.out.println("Erro! A idade tem que ser maior que zero");
            }else {
                System.out.println("Idade cadastrada com sucesso: " + idade);
            }
        }catch (InputMismatchException e){
            System.out.println("Erro! Idade tem que ser numérico.");
        }finally {
            System.out.println("Programa finalizado");
        }

    }
}
