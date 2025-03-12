package polimorfismo.exemplo2;

public class VeiculoApp {
    public static void main(String[] args) {
        Carro c1 = new Carro("fiat", "Argo", 2024, 4);
        Moto m1 = new Moto("fan", "honda", 2025, 130);

        c1.exibirInfo();
        System.out.println();
        m1.exibirInfo();
    }
}
