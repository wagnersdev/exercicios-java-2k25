package polimorfismo.atividades12_03.atividade2;

class Portatil extends ArCondicionado {
    private String voltagem;
    private String cor;

    public Portatil(String codigo, String marca, String btu, String temDefeito, String tipoDefeito, String voltagem, String cor) {
        super(codigo, marca, btu, temDefeito, tipoDefeito);
        this.voltagem = voltagem;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Portátil, Voltagem: " + voltagem + ", Cor: " + cor;
    }
}