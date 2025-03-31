import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String caminho = "C:/Users/rick1/OneDrive/Documents/Formação Java/formacao-java/Formação Java/lendoArquivos/lendoArquivos/src/usuarios.txt";
        
        Arquivo arquivo = new Arquivo();
        String conteudo = arquivo.ler(caminho); 

        System.out.println("Conteudo do arquivo: " + conteudo);
    }
}
