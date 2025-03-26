import java.io.*;

public class Exerc1 {
    public static void receberEntrada() throws IOException{
        System.out.println("Digite um texto: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String texto = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        do{
            bw.write(texto);
            bw.newLine();
            texto = br.readLine();
        } while(!(texto.isEmpty()));
        bw.flush();
        bw.close();
        br.close();
    }
    public static void main(String[] args) throws IOException {
        receberEntrada();
    }
}
