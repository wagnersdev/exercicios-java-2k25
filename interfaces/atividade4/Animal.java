package interfaces.atividade4;

public abstract class Animal {
    private String nome;
    private int patas;

    public Animal(String nome, int patas) {
        this.nome = nome;
        this.patas = patas;
    }

    public String getNome() {
        return nome;
    }

    public int getPatas() {
        return patas;
    }

    abstract void emitirSom();
}
