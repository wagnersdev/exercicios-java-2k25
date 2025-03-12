package polimorfismo.atividades12_03.atividade2;

public class ArCondicionado {
    private String codigo;
    private String marca;
    private String btu;


    public ArCondicionado( String codigo, String marca, String btu) {
        this.codigo = codigo;
        this.marca = marca;
        this.btu = btu;
    }
  
    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getBtu() {
        return btu;
    }
    public void setBtu(String btu) {
        this.btu = btu;
    }


    
}
