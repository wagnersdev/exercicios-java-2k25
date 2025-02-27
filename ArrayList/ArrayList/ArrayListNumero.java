package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            lista.add(numero);
        }


        for (int numero : lista) {
            if (numero == 10 || numero == 100 || numero == 1000) {
                System.out.println("Parabéns! Você ganhou um bônus de R$ 50,00 por digitar " + numero + "!");
            }
        }

        scanner.close();
    }
}