import java.util.Scanner;

public class Desafio {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        int num1 = ler.nextInt();
        System.out.println("Digite o segundo valor: ");
        int num2 = ler.nextInt();

        try{
            contar(num1, num2);
        } catch (Exception e) {
            System.out.println("Erro: " + e);
        }

        ler.close();
    }

    static void contar(int valor1, int valor2) throws Exception {
        if (valor1 > valor2) {
            throw new Exception("O primeiro valor não pode ser maior que o segundo valor");
        }

        int contagem = valor2 - valor1;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o valor: " + i);
        }
        
    }
}
