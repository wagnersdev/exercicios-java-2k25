package AtividadeDeRevisao.Eletrodomesticos;

public class Microondas extends Eletrodomesticos{
    private int tempoMaximo;

    public Microondas(String marca, double potencia, int tempoMaximo) {
        super(marca, potencia);
        this.tempoMaximo = tempoMaximo;
    }

    public int getTempoMaximo() {
        return tempoMaximo;
    }

    public void setTempoMaximo(int tempoMaximo) {
        this.tempoMaximo = tempoMaximo;
    }

    @Override
    void ligar() {
        System.out.println("Microondas ligado");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTempo Maximo = " + tempoMaximo + " minutos";
    }
}
