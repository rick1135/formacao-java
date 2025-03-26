import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exerc2 {
    public static void salvarNoArquivo() throws IOException{
        File f = new File("exerc2.txt");
        if(!(f.exists())){
            f.createNewFile();
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(f));
        System.out.println("Digite 3 filmes: ");
        bw.write("Filmes: ");
        bw.newLine();
        for(int i = 0; i < 3; i++){
            bw.write(System.console().readLine());
            bw.newLine();
        }
        bw.close();
        System.out.println("Filmes salvos no arquivo!");
    }

    public static void lerArquivo() throws IOException{
        File f = new File("exerc2.txt");
        if(f.exists()){
            System.out.println("Arquivo encontrado!");
            Scanner sc = new Scanner(new FileReader(f));
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
    }
    public static void main(String[] args) throws IOException {
        salvarNoArquivo();
        System.out.println("Lendo o arquivo...");
        lerArquivo();
    }
}
