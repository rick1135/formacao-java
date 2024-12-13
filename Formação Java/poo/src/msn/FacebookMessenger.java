package msn;

public class FacebookMessenger extends ServicoMensagem{
    @Override
    public void enviarMensagem(){
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
        salvarHistoricoMensaegns();
    }
    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook");
    }
    private void salvarHistoricoMensaegns(){
        System.out.println("Salvando histórico de mensagens");
    }

}
