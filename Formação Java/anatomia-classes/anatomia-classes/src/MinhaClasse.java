public class MinhaClasse {
    public static void main(String[] args) {
        String nome = "Alberto";
        String sobrenome = "Ribeiro";

        System.out.println(nomeCompleto(nome, sobrenome));
    }
    
    public static String nomeCompleto(String nome, String sobrenome) {
        return nome + " " + sobrenome;
    }
}
