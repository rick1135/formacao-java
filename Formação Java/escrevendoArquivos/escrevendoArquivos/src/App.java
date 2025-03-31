import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("arquivo.txt", true))){
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite o texto que deseja adicionar ao arquivo: ");
            String texto = sc.nextLine();

            bw.write(texto);
            sc.close();
            System.out.println("Texto adicionado ao arquivo com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        } finally {
            System.out.println("Operação concluída.");
        }
    }
}
