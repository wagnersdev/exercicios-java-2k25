package AtividadeDeRevisao.SistemaDeFuncionario;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Wagner", 100,"Desenvolvedor");

        System.out.println(gerente.toString());


        Assistente assistente = new Assistente("Marta", 100, "Programadora");

        System.out.println(assistente.toString());
        assistente.calcularBonus();

    }

}
