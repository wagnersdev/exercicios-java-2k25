package interfaces.atividade2;

public class Programador extends Funcionario{

    int projetosCriados;

    public Programador(String nome, int projetosCriados) {
        super(nome);
        this.projetosCriados = projetosCriados;
    }


    @Override
    public void calcularSalario() {
        double salairo = 5000;
        double bonus = 200;
        System.out.println("Salario do Programador: " + salairo + (projetosCriados * bonus));
    }

}
