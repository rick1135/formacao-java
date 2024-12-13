package msn;

public class Telegram extends ServicoMensagem{
    @Override
    public void enviarMensagem(){
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
        salvarHistoricoMensaegns();
    }
    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Telegram");
    }
    private void salvarHistoricoMensaegns(){
        System.out.println("Salvando histórico de mensagens");
    }
}
