package msn;

public class MSNMensseger extends ServicoMensagem{
    @Override
    public void enviarMensagem(){
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo MSN");
        salvarHistoricoMensaegns();
    }
    @Override
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo MSN");
    }
    private void salvarHistoricoMensaegns(){
        System.out.println("Salvando histórico de mensagens");
    }
}
