import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicacaoTest {
    @Test
    public void validarMultiplicacao(){
        Multiplicacao multiplicacao = new Multiplicacao();

        assertEquals(6, multiplicacao.calcular(3, 2));
        assertEquals(-3, multiplicacao.calcular(3, -1));
        assertEquals(0, multiplicacao.calcular(0, 0));
        assertNotEquals(2, multiplicacao.calcular(3, 2));
    }
}