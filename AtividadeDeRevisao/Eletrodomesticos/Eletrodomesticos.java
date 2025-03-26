package AtividadeDeRevisao.Eletrodomesticos;

public abstract class Eletrodomesticos {
    private String marca;
    private double potencia;

    public Eletrodomesticos(String marca, double potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    abstract void ligar();

    @Override
    public String toString() {
        return
                "\nMarca = " + marca+
                "\nPotencia = " + potencia + "V";
    }
}
