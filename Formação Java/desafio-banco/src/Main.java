public class Main {
    public static void main(String[] args) {
        Cliente Rick = new Cliente();
        Rick.setNome("Rick");
        
        Conta cc = new ContaCorrente(Rick);
        Conta cp = new ContaPoupanca(Rick);

        cc.depositar(500);
        cp.depositar(500);
        cc.transferir(100, cp);
        cc.sacar(100);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
