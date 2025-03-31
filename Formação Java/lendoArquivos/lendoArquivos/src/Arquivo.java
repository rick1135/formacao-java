import java.io.BufferedReader;
import java.io.FileReader;

public class Arquivo {
    public String ler(String caminho){
        String conteudo = "";
        
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))){            
            String linha = br.readLine();

            while(linha!=null){
                conteudo += linha;
                linha = br.readLine();

                if(linha != null){
                    conteudo += "\n";
                }
            }

        } catch(Exception e){
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return conteudo;
    }
}
