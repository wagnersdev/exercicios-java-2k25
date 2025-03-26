package AtividadeDeRevisao.SistemaDeFuncionario;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, double salario, String cargo) {
        super(nome, salario, cargo);
    }

    public double getBonus() {
        bonus = (getSalario() * 10 / 100);
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nBonus = " + getBonus();
    }
}
