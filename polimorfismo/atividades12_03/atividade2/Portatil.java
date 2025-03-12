package polimorfismo.atividades12_03.atividade2;

public class Portatil extends ArCondicionado{
    private int voltagem;
    private String cor;

    
    public Portatil(String codigo, String marca, String btu, int voltagem, String cor) {
        super(codigo, marca, btu);
        this.voltagem = voltagem;
        this.cor = cor;
    }
    public int getVoltagem() {
        return voltagem;
    }
    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    
}
