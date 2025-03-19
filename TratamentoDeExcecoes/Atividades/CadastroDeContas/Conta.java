package TratamentoDeExcecoes.Atividades.CadastroDeContas;

import java.util.InputMismatchException;

public class Conta {
    private int numero;
    private String nomeTitular;
    private double saldo;

    public Conta(int numero, String nomeTitular, double saldo) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        try {
            this.numero = numero;

        }catch (InputMismatchException e){
            System.out.println("Erro! O número inválido.");
        }
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        try {
            this.nomeTitular = nomeTitular;
        }catch (NumberFormatException e){
            System.out.println("Erro! O nome inválido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        try {
            this.saldo = saldo;
        }catch (InputMismatchException e){
            System.out.println("Erro! Saldo inválido");
        }
    }
}
