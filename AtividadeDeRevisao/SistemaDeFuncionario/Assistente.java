package AtividadeDeRevisao.SistemaDeFuncionario;

public class Assistente extends Funcionario{

    public Assistente(String nome, double salario, String cargo) {
        super(nome, salario, cargo);
    }

    public void calcularBonus(){
        double bonus = (getSalario() * 5) / 100;
        System.out.println("Bonus: " + bonus);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
