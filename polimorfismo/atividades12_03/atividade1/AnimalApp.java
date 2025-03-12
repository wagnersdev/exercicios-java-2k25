package polimorfismo.atividades12_03.atividade1;

public class AnimalApp {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("Thor", 4, "Labrador");
        Gato g1 = new Gato("Pandora", 4, "Preto");

        c1.exibirInfo();
        c1.exibirSom();

        g1.exibirInfo();
        g1.exibirSom();
    }
}
