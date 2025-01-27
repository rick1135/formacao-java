public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música no iPhone");
    }
    
    @Override
    public void pausarMusica() {
        System.out.println("Pausando música no iPhone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música no iPhone: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada no iPhone");
    }

    @Override
    public void correioDeVoz() {
        System.out.println("Acessando correio de voz no iPhone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página no iPhone: " + url);
    }

    @Override
    public void novaAba() {
        System.out.println("Abrindo nova aba no iPhone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no iPhone");
    }
}
