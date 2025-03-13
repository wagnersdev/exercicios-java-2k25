package interfaces.atividade2;

public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Carlos");
        System.out.println("Gerente: " + g1.getNome());
        g1.calcularSalario();

        Programador p1 = new Programador("Anderson", 3);
        System.out.println("\nProgramador: " + p1.getNome());
        p1.calcularSalario();
    }
}
