package vetores;

import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Digite a quantidade de nomes: ");
            int quantNomes = sc.nextInt();
            String[] nomes =  new String[quantNomes];

            for(int i=0; i<=quantNomes;i++){
                System.out.println("Digite o"+ (i+1)+"º Nome: ");
                nomes[i] = sc.nextLine();

            }
        sc.close();

        
    }
}