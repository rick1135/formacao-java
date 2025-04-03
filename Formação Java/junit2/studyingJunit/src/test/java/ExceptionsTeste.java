import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {
    @Test
    void validarCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("12345", 0);
        Conta contaDestino = new Conta("12346", 0);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(()->
                transferenciaEntreContas.transfere(contaOrigem, contaDestino, 10));
    }
}
