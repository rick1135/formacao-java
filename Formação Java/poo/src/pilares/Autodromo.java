package pilares;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("8234892");
        jeep.ligar();

        Moto honda = new Moto();
        honda.setChassi("312213");
    }
}
