package TratamentoDeExcecoes.Atividades.CadastroDeContas;

import TratamentoDeExcecoes.Atividades.CadastroDeContas.Exceptions.ContaExistenteException;
import TratamentoDeExcecoes.Atividades.CadastroDeContas.Exceptions.ContaInexistenteException;
import TratamentoDeExcecoes.Atividades.CadastroDeContas.Exceptions.RepositoriosFullException;

public class Main {
    public static void main(String[] args) {
        CadastroDeContas c1 = new CadastroDeContas();

        try {
            // Cadastrando contas
            c1.inserirConta(new Conta("11", "Wagner", 3900));
            c1.inserirConta(new Conta("33", "Fernanda", 39500));

        } catch (ContaExistenteException | RepositoriosFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Tentando cadastrar conta já existente
            c1.inserirConta(new Conta("33", "Fernanda", 39500));
        } catch (ContaExistenteException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Buscando conta cadastrada
            c1.buscarConta("33");
        } catch (ContaInexistenteException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Buscando conta não cadastrada
            c1.buscarConta("88");
        } catch (ContaInexistenteException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Removendo conta
            c1.removerConta("11");
        } catch (ContaInexistenteException e) {
            System.out.println(e.getMessage());
        }
    }
}

