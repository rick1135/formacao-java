package br.com.dio.exceptions;

import javax.swing.*;
import java.io.*;

public class ExceptionCustomizada_1 {
    public static void main(String[] args) {
        String nomeDoArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");
        
        imprimirArquivoNoConsole(nomeDoArquivo);
        System.out.println("\nCom exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) {

        try {
            BufferedReader br = lerArquivo(nomeDoArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAberturaDeArquivoException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage());
            //e.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro não esperado, por favor, fale com o suporte." + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static BufferedReader lerArquivo(String nomeDoArquivo) throws ImpossivelAberturaDeArquivoException {

        File file = new File(nomeDoArquivo);
        System.out.println("Caminho absoluto do arquivo: " + file.getAbsolutePath()); // Adiciona uma mensagem de depuração
        if (!file.exists()) {
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
        }
        try {
            return new BufferedReader(new FileReader(nomeDoArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAberturaDeArquivoException(file.getName(), file.getPath());
        }
    }
}

class ImpossivelAberturaDeArquivoException extends Exception {
    private String nomeDoArquivo;
    private String caminhoDoArquivo;

    public ImpossivelAberturaDeArquivoException(String nomeDoArquivo, String caminhoDoArquivo){
        super("Não foi possível abrir o arquivo " + nomeDoArquivo + " no caminho " + caminhoDoArquivo);
        this.nomeDoArquivo = nomeDoArquivo;
        this.caminhoDoArquivo = caminhoDoArquivo;
    }

    // @Override
    // public String toString() {
    //     return "ImpossivelAberturaDeArquivoException{" +
    //             "nomeDoArquivo='" + nomeDoArquivo + '\'' +
    //             ", caminhoDoArquivo='" + caminhoDoArquivo + '\'' +
    //             '}';
    // }
}