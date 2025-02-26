import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10]; // Array com 10 posições
        int quantidade = 0; // Variável para controlar a quantidade de números no array

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar número");
            System.out.println("2. Exibir números");
            System.out.println("3. Remover número");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    if (quantidade < numeros.length) {
                        System.out.print("Digite o número a ser adicionado: ");
                        int numero = scanner.nextInt();
                        numeros[quantidade] = numero;
                        quantidade++;
                        System.out.println("Número adicionado com sucesso!");
                    } else {
                        System.out.println("Array cheio! Não é possível adicionar mais números.");
                    }
                    break;

                case 2:
                    if (quantidade == 0) {
                        System.out.println("Não tem números cadastrados.");
                    } else {
                        System.out.println("Números cadastrados:");
                        for (int i = 0; i < quantidade; i++) {
                            System.out.println("Índice " + i + ": " + numeros[i]);
                        }
                    }
                    break;

                case 3:
                    if (quantidade == 0) {
                        System.out.println("Array vazio! Não tem números para remover.");
                    } else {
                        System.out.print("Digite o índice do número a ser removido: ");
                        int indice = scanner.nextInt();
                        if (indice >= 0 && indice < quantidade) {
                            for (int i = indice; i < quantidade - 1; i++) {
                                numeros[i] = numeros[i + 1];
                            }
                            quantidade--;
                            System.out.println("Número removido com sucesso!");
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}