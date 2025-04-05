import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtracaoTest {
    @Test
    public void validarSubtracao(){
        Subtracao subtracao = new Subtracao();

        assertEquals(3, subtracao.calcular(5, 2));
        assertEquals(3, subtracao.calcular(2, -1));
        assertEquals(0, subtracao.calcular(0, 0));
        assertNotEquals(2, subtracao.calcular(1, 1));
    }
}