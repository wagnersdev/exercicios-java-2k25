package TratamentoDeExcecoes.Atividades.CadastroDeContas.Exceptions;

public class RepositoriosFullException extends RuntimeException {
    public RepositoriosFullException(String message) {
        super(message);
    }
}
