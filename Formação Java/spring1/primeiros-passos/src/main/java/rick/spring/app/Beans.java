package rick.spring.app;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("CRIANDO OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@tech.com.br");
        remetente.setNome("Time de Tecnologia");
        return remetente;
    }
}
