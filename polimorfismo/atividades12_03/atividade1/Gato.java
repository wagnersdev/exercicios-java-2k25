package polimorfismo.atividades12_03.atividade1;

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

    public void exibirInfo(){
        System.out.println("Nome: " + getNome());
        System.out.println("Patas: " + getPatas());
        System.out.println("Cor: " + cor);
    }

    public void exibirSom(){
        System.out.println("Mia");
    }
    
}
