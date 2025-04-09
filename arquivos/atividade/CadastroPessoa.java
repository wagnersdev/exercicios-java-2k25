package atividade;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPessoa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> pessoa = new ArrayList<>();
        String nomeArquivo = "mensagem.txt";

        while (true) {
            System.out.println("=== MENU ===");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - LISTAR / LER");
            System.out.println("3 - SAIR");
            System.out.println("Escolha uma opção: ");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    sc.nextLine();
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Idade: ");
                    String idade = sc.nextLine();

                    pessoa.add(nome);
                    pessoa.add(idade);

                    try(BufferedWriter escrito = new BufferedWriter(new FileWriter(nomeArquivo, true))){
                        for(String p : pessoa){
                            escrito.write(p);
                        }
                        escrito.newLine();
                        escrito.close();
                        System.out.println("O arquivo "+ nomeArquivo + " criado com sucesso");
    
                    }catch(IOException e){
                    System.out.println(" Erro ao criar o arquivo");
                    }
                    break;
                case 2:
                    try(BufferedReader reader = new BufferedReader((new FileReader(nomeArquivo)))){
                        String linha;
                        System.out.println("Conteudo do arquivo");

                        while ((linha=reader.readLine()) != null) {
                            System.out.println(linha);
                            
                        }
                        reader.close();
                    }catch(FileNotFoundException e){
                        System.out.println( " Erro: arquivo " + nomeArquivo+ " nao foi encontrado");
                    }catch(IOException e){
                        System.out.println(" Erro ao ler o arquivo");
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    break;
            }
        }
    }
    
}
