public class Main {
    public static void main(String[] args) {
        // Cria uma instância de iPhone
        iPhone meuIPhone = new iPhone();

        // Testa os métodos do ReprodutorMusical
        System.out.println("=== Testando Reprodutor Musical ===");
        meuIPhone.tocarMusica();
        meuIPhone.selecionarMusica("Bohemian Rhapsody - Queen");
        meuIPhone.pausarMusica();

        // Testa os métodos do AparelhoTelefonico
        System.out.println("\n=== Testando Aparelho Telefônico ===");
        meuIPhone.ligar("123456789");
        meuIPhone.atender();
        meuIPhone.correioDeVoz();

        // Testa os métodos do NavegadorInternet
        System.out.println("\n=== Testando Navegador de Internet ===");
        meuIPhone.exibirPagina("https://www.example.com");
        meuIPhone.novaAba();
        meuIPhone.atualizarPagina();
    }
}