import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.mockito.ArgumentMatchers.anyString;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest  {
    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void cadastrarPessoa(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("MG", "Espinosa", "Rua padre jose puche", "Casa", "Jardim Oriente");

        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenReturn(dadosLocalizacao);

        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("José", "11111111111", LocalDate.of(1999, 1, 1), "39510000");

        assertEquals("José", pessoa.getNome());
        assertEquals("11111111111", pessoa.getDocumento());
        assertEquals("MG", pessoa.getUf());
        assertEquals("Casa", pessoa.getEndereco().getComplemento());
        assertEquals("Espinosa", pessoa.getEndereco().getCidade());
        
    }

    @Test
    void lancarExceptionQuandoChamarApiCorreios(){
        Mockito.doThrow(IllegalArgumentException.class)
                        .when(apiDosCorreios).buscaDadosComBaseNoCep(anyString());

        assertThrows(IllegalArgumentException.class, () -> cadastrarPessoa.cadastrarPessoa("José", "11111111111", LocalDate.of(1999, 1, 1), "39510000"));
    }


}
