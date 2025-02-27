package poo.atividade5;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Double> notas;
    public Aluno(String nome, ArrayList<Double> notas) {
        this.nome = nome;
        this.notas = notas;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Double> getNotas() {
        return notas;
    }
    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    

   
    
}
