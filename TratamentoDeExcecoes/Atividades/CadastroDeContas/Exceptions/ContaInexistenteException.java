package TratamentoDeExcecoes.Atividades.CadastroDeContas.Exceptions;

public class ContaInexistenteException extends RuntimeException {

    public ContaInexistenteException(String message) {
      super(message);
    }
}
