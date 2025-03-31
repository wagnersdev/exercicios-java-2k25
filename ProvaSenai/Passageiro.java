package ProvaSenai;

public class Passageiro {
    private String nome;
    private int numeroAviao;


    public Passageiro(String nome, int numeroAviao) {
        this.nome = nome;
        this.numeroAviao = numeroAviao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroAviao() {
        return numeroAviao;
    }

    public void setNumeroAviao(int numeroAviao) {
        this.numeroAviao = numeroAviao;
    }
}
