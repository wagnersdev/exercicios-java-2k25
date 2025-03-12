package polimorfismo.exemplo2;

public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(String nome, String marca, int ano, int cilindrada) {
        super(nome, marca, ano);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void exibirInfo(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Marca: "+ getMarca());
        System.out.println("Ano: "+ getAno());
        System.out.println("Cilindrada: " + cilindrada);
    }

}
