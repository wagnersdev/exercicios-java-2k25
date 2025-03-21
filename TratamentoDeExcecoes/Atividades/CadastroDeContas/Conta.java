package TratamentoDeExcecoes.Atividades.CadastroDeContas;

import TratamentoDeExcecoes.Atividades.CadastroDeContas.Exceptions.DadoInvalidoException;

import java.util.InputMismatchException;

public class Conta{
    private String numero;
    private String nomeTitular;
    private double saldo;

    public Conta(String numero, String nomeTitular, double saldo) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {

        if (numero == null || numero.isEmpty()) {
            throw new DadoInvalidoException("Erro! O número da conta não pode estar vazio.");
        }
        this.numero = numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        if (nomeTitular == null || nomeTitular.trim().isEmpty()) {
            throw new DadoInvalidoException("Erro! O nome do titular não pode estar vazio.");
        }
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new DadoInvalidoException("Erro! O saldo não pode ser negativo.");
        }
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\nConta: " +
                "\nNúmero = " + numero +
                "\nNome Titular = " + nomeTitular+
                "\nSaldo = " + saldo;
    }
}
