package polimorfismo.exemplo2;

public class Carro extends Veiculo {
    private int qtdPortas;

    public Carro(String nome, String marca, int ano, int qtdPortas) {
        super(nome, marca, ano);
        this.qtdPortas = qtdPortas;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }
    
    public void exibirInfo(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Marca: "+ getMarca());
        System.out.println("Ano: "+ getAno());
        System.out.println("Quantidade de portas: " + qtdPortas);
    }
    
}
