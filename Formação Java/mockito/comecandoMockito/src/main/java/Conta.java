public class Conta {
    private int saldo;

    public Conta(int saldo) {
        this.saldo = saldo;
    }

    public void pagaBoleto(int valor){
        validaSaldo(valor);
        debita(valor);
        enviaCreditoParaEmissor(valor);
    }

    public void validaSaldo(int valor){
        if(valor>saldo) throw new IllegalStateException("Saldo insuficiente");
    }

    public void debita(int valor){
        saldo -= valor;
    }
    public void enviaCreditoParaEmissor(int valor){
        // Envia o valor para o emissor do boleto
        System.out.println("Enviando " + valor + " para o emissor do boleto.");
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
