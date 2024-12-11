import java.util.Scanner;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        try{
            System.out.println("Digite seu nome");
            String nome = ler.nextLine();
    
            System.out.println("Digite seu sobrenome");
            String sobrenome = ler.nextLine();
    
            System.out.println("Digite sua idade");
            int idade = ler.nextInt();
    
            System.out.println("Digite sua altura");
            double altura = ler.nextDouble();
    
            System.out.println("Meu nome é " + nome + " " + sobrenome + ", tenho " + idade + " anos e " + altura + " de altura.");
            ler.close();
        }catch(Exception e){
            System.out.println("Os campos idade e altura devem ser numéricos");
        }
    }
}
