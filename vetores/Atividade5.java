import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] numeros = new int[5];

        for(int i=0;i<numeros.length; i++){
            System.out.println("Digite o numero "+(i+1)+":");
            numeros[i]=sc.nextInt();

            if(numeros[i] > numeros[i]){
                System.out.println("O array esta cheio");
            }

            
        }

    sc.close();
    }
}
