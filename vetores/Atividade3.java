package vetores;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int [] numeros = new int[5];
        int maior = 0;

        for(int i=0;i<numeros.length; i++){
            System.out.println("Digite o numero "+(i+1)+":");
            numeros[i]=sc.nextInt();
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }

        System.out.println("o maior numero é "+maior);
    sc.close();
    }
}
