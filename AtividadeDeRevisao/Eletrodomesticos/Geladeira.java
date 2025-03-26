package AtividadeDeRevisao.Eletrodomesticos;

public class Geladeira extends Eletrodomesticos{
    private double capacidade;

    public Geladeira(String marca, double potencia, double capacidade) {
        super(marca, potencia);
        this.capacidade = capacidade;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    void ligar() {
        System.out.println("Geladeira ligada");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCapacidade = " + capacidade;
    }
}
