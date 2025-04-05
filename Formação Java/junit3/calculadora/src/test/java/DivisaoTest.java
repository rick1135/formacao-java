import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisaoTest {
    @Test
    public void validarDivisao(){
        Divisao divisao = new Divisao();

        assertEquals(1, divisao.calcular(2, 2));
        assertEquals(-3, divisao.calcular(3, -1));
        assertNotEquals(2, divisao.calcular(2, 2));
    }
}