package poo.exemplo;

public class PessoaApp {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Wagner", "7199993");

        System.out.println("Nome: "+p1.getNome()+ " Telefone: " + p1.getTelefone());

        p1.setNome("Vanessa");
        System.out.println("\nNome: "+p1.getNome()+ " Telefone: " + p1.getTelefone());

        Pessoa p2 = new Pessoa("Marta", "7593884948");

        System.out.println("\nNome: "+p2.getNome()+ " Telefone: "+p2.getTelefone());

    }
}
