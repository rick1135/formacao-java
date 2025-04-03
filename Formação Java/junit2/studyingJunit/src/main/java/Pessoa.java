import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pessoa {
    private String nome;
    private LocalDateTime nascimento;

    public Pessoa(String nome, LocalDateTime nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getNascimento() {
        return nascimento;
    }

    public int getIdade(){
        return LocalDate.now().getYear() - this.nascimento.getYear();
    }

    public boolean maiorDeIdade(){
        return getIdade()>=18;
    }
}
