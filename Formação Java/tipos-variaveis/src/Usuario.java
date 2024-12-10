
import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int canal;
        SmartTv smartTv = new SmartTv();
        if (smartTv.ligada == true) {
            System.out.println("A televisão está ligada");
        } else {
            System.out.println("A televisão está desligada");
        }
        System.out.println("A tv está no canal " + smartTv.canal);
        System.out.println("A tv está no volume " + smartTv.volume);

        smartTv.ligar();
        if (smartTv.ligada == true) {
            System.out.println("A televisão está ligada");
        } else {
            System.out.println("A televisão está desligada");
        }
        System.out.printf("Informe qual canal deseja assistir:\n");
        canal = ler.nextInt();
        smartTv.mudarCanal(canal);
        System.out.println("A tv está no canal " + smartTv.canal);
    }
}
