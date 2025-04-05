import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        do{
            System.out.println("Informe a operação a ser realizada:");
            System.out.println("0 - Sair\n1 - Soma\n2 - Subtracao\n3 - Divisao\n4 - Multiplicacao");
            op = scanner.nextInt();
            if(op!=0){
                try{
                    System.out.println("Informe o primeiro número:");
                    double x = scanner.nextDouble();
    
                    System.out.println("Informe o segundo número:");
                    double y = scanner.nextDouble();
    
                    switch(op){
                        case 1:
                            Soma soma = new Soma();
                            System.out.println("Resultado: " + soma.calcular(x, y));
                            break;
                        case 2:
                            Subtracao subtracao = new Subtracao();
                            System.out.println("Resultado; " + subtracao.calcular(x, y));
                            break;
                        case 3:
                            Divisao divisao = new Divisao();
                            System.out.println("Resultado: " + divisao.calcular(x, y));
                            break;
                        case 4:
                            Multiplicacao multiplicacao = new Multiplicacao();
                            System.out.println("Resultado: " + multiplicacao.calcular(x, y));
                            break;
                        default:
                            System.out.println("Operação inválida!");
                            break;                        
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Por favor, insira apenas números válidos.");
                    scanner.nextLine();
                }
            }
        } while(op!=0);
    }
}
