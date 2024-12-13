package msn;

import java.util.Scanner;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escolha o serviço de mensagem: ");
        System.out.println("1 - MSN");
        System.out.println("2 - Facebook");
        System.out.println("3 - Telegram");
        int opcao = ler.nextInt();

        if (opcao == 1) {
            MSNMensseger msn = new MSNMensseger();
            System.out.println("MSN");
            msn.enviarMensagem();
            msn.receberMensagem();
        } else if (opcao == 2) {
            FacebookMessenger facebook = new FacebookMessenger();
            System.out.println("Facebook");
            facebook.enviarMensagem();
            facebook.receberMensagem();
        } else if (opcao == 3) {
            Telegram telegram = new Telegram();
            System.out.println("Telegram");
            telegram.enviarMensagem();
            telegram.receberMensagem();
        } else {
            System.out.println("Opção inválida");
        }

        ler.close();
    }
}
