package laco_de_repeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int num;
            System.out.println("Digite o valor da tabuada: ");
            num = sc.nextInt();

            for(int i=1;i<=10;i++){
                System.out.println(num + "x" + i + "=" + (num*i));
            }
        sc.close();

    
    }
}
