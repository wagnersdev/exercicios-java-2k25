package AtividadeDeRevisao.Eletrodomesticos;

public class Main {
    public static void main(String[] args) {
        Geladeira geladeira = new Geladeira("Philco",220,23);
        System.out.println(geladeira.toString());
        geladeira.ligar();

        Microondas microondas = new Microondas("philco",220,20);
        System.out.println(microondas.toString());
        geladeira.ligar();
    }
}
