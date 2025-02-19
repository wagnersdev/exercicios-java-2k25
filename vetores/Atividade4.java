import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int [] numeros = new int[10];
        int maior = 0;
        int menor = 0;

        for(int i=0;i<numeros.length; i++){
            System.out.println("Digite o numero "+(i+1)+":");
            numeros[i]=sc.nextInt();
            if (numeros[i] > maior){
                maior = numeros[i];
            }else{
                menor = numeros[i];
            }
        }

        System.out.println("Maior Numero: "+maior);
        System.out.println("Menor Numero: "+ menor);
    sc.close();
    }
}
