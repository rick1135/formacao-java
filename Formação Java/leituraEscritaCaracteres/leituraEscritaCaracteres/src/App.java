import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        File f = new File("arquivo.txt");
        if(f.exists()){
            System.out.println("Arquivo existe");
        }else{
            System.out.println("Arquivo não existe, criando o arquivo...");
            f.createNewFile();
        }
        System.out.println("Nome do arquivo: " + f.getName());
        System.out.println("Caminho do arquivo: " + f.getPath());
        System.out.println("Caminho absoluto do arquivo: " + f.getAbsolutePath());
        System.out.println("Deseja escrever algo no arquivo?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não, apenar ler");
        String resposta = System.console().readLine();
        if(resposta.equals("1")){
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));
            System.out.println("Digite o texto que deseja escrever no arquivo: ");
            String texto = System.console().readLine();
            bw.write(texto);
            bw.close();
        } else{
            System.out.println("Conteúdo do arquivo: ");
            Scanner sc = new Scanner(new FileReader("arquivo.txt"));
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
    }
}
