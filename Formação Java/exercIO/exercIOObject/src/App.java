import java.io.*;

public class App {
    public static void serealizarGato(){
        Gato gato = new Gato("Simba", 3, "Preto", true);

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
        String arquivo = "gato";
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
            Gato objetoGato = (Gato) ois.readObject();

            System.out.printf("Nome: %s\nIdade: %d\nCor: %s\nCastrado: %s\n", objetoGato.getNome(), objetoGato.getIdade(), objetoGato.getCor(), objetoGato.isCastrado() ? "Sim" : "Não");
            System.out.println(objetoGato);

            ois.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro de entrada/saída: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Classe não encontrada: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // serealizarGato();
        deserealizarGato();
    }
}
