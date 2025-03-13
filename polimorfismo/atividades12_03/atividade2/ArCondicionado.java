package polimorfismo.atividades12_03.atividade2;

public class ArCondicionado {
    private String codigo;
    private String marca;
    private String btu;
    private String temDefeito;
    private String tipoDefeito;

    public ArCondicionado(String codigo, String marca, String btu, String temDefeito, String tipoDefeito) {
        this.codigo = codigo;
        this.marca = marca;
        this.btu = btu;
        this.temDefeito = temDefeito;
        this.tipoDefeito = tipoDefeito;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Marca: " + marca + ", BTU: " + btu +
                ", Tem Defeito: " + temDefeito + ", Tipo de Defeito: " + tipoDefeito;
    }
}