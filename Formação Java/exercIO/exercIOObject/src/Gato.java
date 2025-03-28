import java.io.Serializable;

public class Gato implements Serializable{
    private String nome;
    private Integer idade;
    private String cor;
    private boolean castrado;

    public Gato(String nome, Integer idade, String cor, boolean castrado) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.castrado = castrado;
    }

    public Gato(){}

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    public boolean isCastrado() {
        return castrado;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                ", castrado=" + castrado +
                '}';
    }
}