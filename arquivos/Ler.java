import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ler {
    public static void main(String[] args) {
        String nomeArquivo="mensagem.txt";

        try(BufferedReader reader = new BufferedReader((new FileReader(nomeArquivo)))){
            String linha;
            System.out.println("Conteudo do arquivo");

            while ((linha=reader.readLine()) != null) {
                System.out.println(linha);
                
            }
            reader.close();
        }catch(FileNotFoundException e){
            System.out.println( " Erro: arquivo " + nomeArquivo + " nao foi encontrado");
        }catch(IOException e){
            System.out.println(" Erro ao ler o arquivo");
        }
    }
}
