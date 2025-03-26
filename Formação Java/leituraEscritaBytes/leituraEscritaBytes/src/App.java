import java.io.*;

public class App {
    public static void copiarArquivo(){
        try{
            File f = new File("exerc3.txt");
            String nomeArq = f.getName();

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(nomeArq));
            File f2 = new File("copia_" + nomeArq);
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(f2));
            
            while(bis.available() > 0){
                bos.write(bis.read());
                bos.flush();
            }
            bis.close();
            bos.close();
            System.out.println("Arquivo copiado com sucesso!");
            PrintStream ps = new PrintStream(System.out);
            ps.printf("Arquivo %s copiado com sucesso e está no diretório %s com %d bytes\n", nomeArq, f2.getAbsolutePath(), f2.length());
        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        copiarArquivo();
    }
}
