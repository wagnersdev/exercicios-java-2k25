package poo.atividade3;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteApp {
    public static void main(String[] args) {

        ArrayList<Cliente> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite seu email: ");
        String emailCliente = sc.nextLine();

        System.out.println("Digite seu telefone");
        String telefoneCliente = sc.nextLine();

        list.add(new Cliente(nomeCliente, emailCliente, telefoneCliente));

        for(Cliente c:list){
            System.out.println("Nome: " + c.getNome() + "Email: " + c.getEmail() + "Telefone: " + c.getTelefone());
        }


        sc.close();
    }
}
