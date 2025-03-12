package polimorfismo.atividades12_03.atividade2;

public class Splinter extends ArCondicionado{
    private String tipo;
    private String tamanho;


    public Splinter(String codigo, String marca, String btu, String tipo, String tamanho) {
        super(codigo, marca, btu);
        this.tipo = tipo;
        this.tamanho = tamanho;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getTamanho() {
        return tamanho;
    }


    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    

    
    
}
