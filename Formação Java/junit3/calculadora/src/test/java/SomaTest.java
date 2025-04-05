import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SomaTest {
    @Test
    public void validarSoma(){
        Soma soma = new Soma();

        assertEquals(5.0, soma.calcular(2.0, 3.0));
        assertEquals(-1.0, soma.calcular(-2.0, 1.0));
        assertEquals(0.0, soma.calcular(0, 0));
        assertNotEquals(3, soma.calcular(2, 2));
    }
}
