package polimorfismo.atividades12_03.atividade1;

public class Cachorro extends Animal{
    private String raca;

    

    public Cachorro(String nome, int patas, String raca) {
        super(nome, patas);
        this.raca = raca;
    }
    
    public String getRaca() {
        return raca;
    }
    
    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public void exibirInfo(){
        System.out.println("Nome: " + getNome());
        System.out.println("Patas: " + getPatas());
        System.out.println("Raça: " + raca);
    }

    public void exibirSom(){
        System.out.println("Late");
    }
}
