import java.io.*;

public class Exerc3 {
    public static void copiarArquivo() throws IOException{
        File f = new File("exerc2.txt");
        if(f.exists()){
            File f2 = new File("exerc3.txt");
            if(!(f2.exists())){
                f2.createNewFile();
            }
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
            do{
                bw.write(line);
                bw.newLine();
                bw.flush();
                line = br.readLine();
            } while (line != null);
            br.close();
            bw.close();
            System.out.println("Arquivo copiado com sucesso!");
        } else{
            System.out.println("Arquivo não encontrado!");
        }
    }

    public static void adicionarConteudo() throws IOException{
        File f = new File("exerc3.txt");
        if(f.exists()){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
            bw.newLine();
            bw.write("Novos filmes recomendados:");
            bw.newLine();
            System.out.println("Escreva os filmes recomendados, para finalizar escreva 'sair': ");
            String escrita;
            while(true){
                escrita = br.readLine();
                if(escrita.equals("sair")) break;
                bw.write(escrita);
                bw.newLine();
            }
            bw.flush();
            br.close();
            bw.close();
            System.out.println("Conteúdo adicionado com sucesso!");
        } else{
            System.out.println("Arquivo não encontrado!");
        }
    }

    public static void main(String[] args) throws IOException {
        copiarArquivo();
        adicionarConteudo();
    }
}
