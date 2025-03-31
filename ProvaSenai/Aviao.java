package ProvaSenai;

import java.util.ArrayList;
import java.util.Scanner;

public class Aviao {

    private ArrayList<Integer> avioes = new ArrayList<>();
    private ArrayList<Integer> qtdAssentos = new ArrayList<>();
    private ArrayList<Passageiro> passageiros = new ArrayList<>();
    private int maxReservas = 20;
    private Scanner sc = new Scanner(System.in);

    
    public void registrarNumeroAviao() {
        System.out.print("Quantos aviões estarão disponíveis (máximo 4): ");
        int qtdAviao = sc.nextInt();
        sc.nextLine();

        if (qtdAviao > 4) {
            System.out.println("O limite maximo é de 4 aviões!");
            return;
        }

        for (int i = 0; i < qtdAviao; i++) {
            System.out.print("Digite o número do " + (i + 1) + "º avião: ");
            int numeroAviao = sc.nextInt();
            avioes.add(numeroAviao);

            System.out.print("Digite a quantidade de assentos disponiveis para este avião: ");
            int assentos = sc.nextInt();
            sc.nextLine();
            qtdAssentos.add(assentos);
        }

        System.out.println("\nAviões cadastrados com sucesso!");
    }

    
    public void exibirAssentos() {
        if (avioes.isEmpty()) {
            System.out.println("Ainda não há aviões cadastrados!");
            return;
        }

        System.out.println("Lista de aviões e seus assentos:");
        for (int i = 0; i < avioes.size(); i++) {
            System.out.println("Avião " + avioes.get(i) + " - Assentos disponiveis: " + qtdAssentos.get(i));
        }
    }
    
    public void reservarPassagem() {
        if (passageiros.size() >= maxReservas) {
            System.out.println("O limite máximo de 20 reservas atingido!");
            return;
        }

        System.out.print("Digite o número do aviao a ser reservado: ");
        int numeroAviao = sc.nextInt();
        sc.nextLine();

        
        int indiceAviao = avioes.indexOf(numeroAviao);
        if (indiceAviao == -1) {
            System.out.println("Este avião não existe!");
            return;
        }
        
        if (qtdAssentos.get(indiceAviao) <= 0) {
            System.out.println("Não há assentos disponíveis para este avião!");
            return;
        }

        System.out.print("Digite o nome do passageiro: ");
        String nome = sc.nextLine();
        
        passageiros.add(new Passageiro(nome, numeroAviao));
        int assentosAtualizados = qtdAssentos.get(indiceAviao) - 1;
        qtdAssentos.set(indiceAviao, assentosAtualizados);

        System.out.println("Reserva realizada com sucesso para o passageiro " + nome + " no aviao " + numeroAviao);
    }

    
    public void consultarPorAviao() {
        System.out.print("Digite o número do avião: ");
        int numeroAviao = sc.nextInt();

        System.out.println("Passageiros do aviao " + numeroAviao + ":");
        for (Passageiro p : passageiros) {
            if (p.getNumeroAviao() == numeroAviao) {
                System.out.println("- " + p.getNome());
            }else{
                System.out.println("esse aviao nao existe.");
            }
        }
    }


    public void consultarPorPassageiro() {
        sc.nextLine();
        System.out.print("Digite o nome do passageiro: ");
        String nomePassageiro = sc.nextLine();

        for (Passageiro p : passageiros) {
            if (p.getNome().equalsIgnoreCase(nomePassageiro)) {
                System.out.println("O passageiro " + nomePassageiro + " está no aviao: " + p.getNumeroAviao());
                return;
            }
        }

        System.out.println("Passageiro não encontrado!");

    }
}
