import java.io.*;
import java.util.*;

public class App {
    public static void incluirProduto() throws FileNotFoundException{
        File f = new File("C:/Users/rick1/OneDrive/Documents/pecas-roupas.bin");
        if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try{
            PrintStream ps = new PrintStream(System.out);
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getPath(), true));
            Scanner scan = new Scanner(System.in);
            ps.print("Digite o nome do produto: ");
            String nome = scan.nextLine();
            dos.writeUTF(nome);
            ps.print("Digite o tamanho do produto(P/M/G): ");
            char tamanho = scan.next().charAt(0);
            dos.writeChar(tamanho);
            ps.print("Digite a quantidade do produto: ");
            int quantidade = scan.nextInt();
            scan.nextLine(); 
            dos.writeInt(quantidade);
            ps.print("Digite o valor do produto: ");
            double valor = scan.nextDouble();
            dos.writeDouble(valor);

            ps.printf("O arquivo %s foi criado com sucesso com %d bytes no diretório '%s'\n", f.getName(), f.length(), f.getAbsolutePath());
            dos.close();
            scan.close();    
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerProduto(){
        File f = new File("C:/Users/rick1/OneDrive/Documents/pecas-roupas.bin");

        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(f.getPath()));
            String nome = dis.readUTF();
            char tamanho = dis.readChar();
            int quantidade = dis.readInt();
            double valor = dis.readDouble();
            
            System.out.printf("Nome: %s\nTamanho: %c\nQuantidade: %d\nValor: %.2f\n", nome, tamanho, quantidade, valor);
            System.out.printf("Total do valor das peças: %.2f\n", (quantidade * valor));    
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }    

    public static void main(String[] args) throws Exception {
        incluirProduto();
        lerProduto();
    }
}
