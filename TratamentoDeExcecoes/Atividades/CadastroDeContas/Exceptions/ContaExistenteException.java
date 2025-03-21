package TratamentoDeExcecoes.Atividades.CadastroDeContas.Exceptions;

public class ContaExistenteException extends RuntimeException {
    public ContaExistenteException(String message) {
        super(message);
    }
}
