package TratamentoDeExcecoes.Atividades.CadastroDeContas;

import TratamentoDeExcecoes.Atividades.CadastroDeContas.Exceptions.ContaExistenteException;
import TratamentoDeExcecoes.Atividades.CadastroDeContas.Exceptions.ContaInexistenteException;
import TratamentoDeExcecoes.Atividades.CadastroDeContas.Exceptions.RepositoriosFullException;

import java.util.ArrayList;

public class CadastroDeContas {

    private ArrayList<Conta> contas = new ArrayList<>();
    private int limiteMaximo = 3;


    public void inserirConta(Conta conta) throws RepositoriosFullException, ContaExistenteException {
        if (contas.size() >= limiteMaximo) {
            throw new RepositoriosFullException("Erro! Atingiu o limite de contas no sistema.");
        }

        for (Conta c : contas) {
            if (c.getNumero().equals(conta.getNumero())) {
                throw new ContaExistenteException("Erro! Conta já cadastrada.");
            }
        }

        contas.add(conta);
        System.out.println("Conta cadastrada com sucesso.");
    }


    public void buscarConta(String numero) throws ContaInexistenteException{
            boolean encontrada = false;
            for (Conta c: contas){
                if (c.getNumero().equals(numero)){
                    System.out.println(c);
                    encontrada = true;
                    break;

                }
            }
            if (!encontrada){
                throw new ContaInexistenteException("Erro! A conta com este número não existe.");
            }


    }

    public void removerConta(String numero){
            boolean encontrada = false;
            for(Conta conta : contas){
                if(conta.getNumero().equals(numero)){
                    contas.remove(conta);
                    encontrada = true;
                    System.out.println("Conta removida!");
                    break;
                }

                if(!encontrada){
                    throw new ContaInexistenteException("Erro! a conta com este número não existe.");
                }

            }


    }
}
