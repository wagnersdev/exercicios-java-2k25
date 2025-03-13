package interfaces.atividade2;

public class Gerente extends Funcionario{

    public Gerente(String nome) {
        super(nome);
    }



    @Override
    public void calcularSalario() {
        double salarioFixo = 8000;

        System.out.println("Salario do Gerente: " + salarioFixo);
    }
}
