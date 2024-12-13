public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro estado : EstadoBrasileiro.values()){
            System.out.println("Nome: " + estado.getNome());
            System.out.println("Sigla: " + estado.getSigla());
            System.out.println("IBGE: " + estado.getIbge());
            System.out.println("----");
        }
    }
    
}
