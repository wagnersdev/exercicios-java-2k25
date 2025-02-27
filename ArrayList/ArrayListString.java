
package arrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        java.util.ArrayList<String> lista = new java.util.ArrayList<>();


        System.out.println("Digite 10 palavras:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Palavra " + (i + 1) + ": ");
            lista.add(scanner.nextLine());
        }

        System.out.println("\nLista antes da ordenação:");
        for (String s : lista) {
            System.out.println(s);
        }

        Collections.sort(lista);

        System.out.println("\nLista após a ordenação:");
        for (String s : lista) {
            System.out.println(s);
        }
        scanner.close();
    }
}