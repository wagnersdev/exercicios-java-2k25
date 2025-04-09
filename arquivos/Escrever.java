import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escrever{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a frase");
        String frase = sc.nextLine();

        String nomeArquivo = "mensagem.txt";

        try(BufferedWriter escrito = new BufferedWriter(new FileWriter(nomeArquivo, true))){
            escrito.write(frase);
            escrito.newLine();
            escrito.close();
            System.out.println("O arquivo "+ nomeArquivo + " criado com sucesso");
    
        }catch(IOException e){
            System.out.println(" Erro ao criar o arquivo");
        }


        sc.close();
    }
}