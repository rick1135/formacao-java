package lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche() {
        System.out.println("Lanche escolhido");
    }
    public void fazerPedido(){
        System.out.println("Pedido feito");
    }
    public void pagarConta(){
        consultarSaldoAplicativo();
        System.out.println("Conta paga");
    }
    private void consultarSaldoAplicativo(){
        System.out.println("Saldo consultado");
    }
}
