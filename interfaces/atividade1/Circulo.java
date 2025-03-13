package interfaces.atividade1;

public class Circulo extends Forma {

    @Override
    void calcularArea() {
        double areaDoCirculo = 3.14 * Math.pow(9, 2);
        System.out.println("Area do Circulo: " + areaDoCirculo);
    }
}
