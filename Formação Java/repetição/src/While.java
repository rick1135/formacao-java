import java.util.concurrent.ThreadLocalRandom;
public class While {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada>0){
            Double valorDoce = valorAleatorio();
            if(valorDoce>mesada) valorDoce = mesada;
            System.out.printf("Comprei um doce no valor de R$ %.2f\n", valorDoce);
            mesada -= valorDoce;
        }
    }
    
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
