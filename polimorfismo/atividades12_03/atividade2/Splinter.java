package polimorfismo.atividades12_03.atividade2;

class Splinter extends ArCondicionado {
    private String tamanho;
    private String tipos;

    public Splinter(String codigo, String marca, String btu, String temDefeito, String tipoDefeito, String tamanho, String tipos) {
        super(codigo, marca, btu, temDefeito, tipoDefeito);
        this.tamanho = tamanho;
        this.tipos = tipos;
    }

    @Override
    public String toString() {
        return super.toString() + ", Modelo: Splinter, Tamanho: " + tamanho + ", Tipos: " + tipos;
    }
}