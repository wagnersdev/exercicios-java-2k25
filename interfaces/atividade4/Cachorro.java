package interfaces.atividade4;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, int patas, String raca) {
        super(nome, patas);
        this.raca = raca;
    }



    @Override
    void emitirSom() {
        System.out.println("Late");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {

        return "Nome: " + getNome() +
                "\n" +
                "Raça: " + raca +
                "\n"+
                "Patas: " +
                getPatas();
    }
}
