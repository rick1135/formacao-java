package exerc;

import exerc.Gato;
import java.io.*;

public class ExemploIOObject {
    public static void serealizarGato(){
        Gato gato = new Gato("Simba", 3, "Preto");

        try{
            File f = new File("gato");
            if(!f.exists()){
                f.createNewFile();
            }
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()));
            oos.writeObject(gato);
            PrintStream ps = new PrintStream(System.out);
            ps.printf("O arquivo %s foi criado com sucesso com %d bytes no diretório '%s'\n", f.getName(), f.length(), f.getAbsolutePath());
            oos.close();
            ps.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deserealizarGato(){

    }

    public static void main(String[] args) {
        serealizarGato();
        // deserealizarGato();
    }
}
