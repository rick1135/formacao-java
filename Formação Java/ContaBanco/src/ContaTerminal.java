import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Digite o número da conta: ");
        conta.NumeroConta = ler.nextInt();
        System.out.println("Digite a agência: ");
        conta.Agencia = ler.next();
        System.out.println("Digite o nome do titular: ");
        conta.NomeCliente = ler.next();
        System.out.println("Digite o saldo: ");
        conta.Saldo = ler.nextDouble();

        System.out.println("Conta criada com sucesso!");
        System.out.println("Olá, " + conta.NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + conta.Agencia + ", conta " + conta.NumeroConta + " e seu saldo " + conta.Saldo
                + " já está disponível para saque.");
        
        ler.close();
    }
}
