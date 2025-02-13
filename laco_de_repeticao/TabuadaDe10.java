package laco_de_repeticao;


import java.util.Scanner;

public class TabuadaDe10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            for(int i=1;i<=10;i++){
                System.out.println(i + "x" + i + "=" + (i*i));
            }
        sc.close();

    
    }
}
