import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {
    @Test
    @EnabledForJreRange(min=JRE.JAVA_11, max=JRE.JAVA_17)
    void validarAlgoSomenteNoUsuarioRick(){
        Assertions.assertEquals(10, 5+5);
    }
}
