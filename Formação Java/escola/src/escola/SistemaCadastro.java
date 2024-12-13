package escola;

public class SistemaCadastro {
    public static void main(String[] args) {
        Aluno marcos = new Aluno("Marcos", "123.456.789-00");

        marcos.setEndereco("Rua padre josé de anchieta, 123");

        System.out.println(
                "Nome: " + marcos.getNome() + "\nCPF: " + marcos.getCpf() + "\nEndereço: " + marcos.getEndereco());
    }
}
