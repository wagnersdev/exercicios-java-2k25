package interfaces.atividade4;

public class Gato extends Animal{
    private String cor;

    public Gato(String nome, int patas, String cor) {
        super(nome, patas);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    @Override
    void emitirSom() {
        System.out.println("Mia");
    }

    @Override
    public String toString() {
        return "Gato" +
                "\nNome: "+ getNome() +
                "\nCor = " + cor + "\n Patas: "+ getPatas();
    }
}


