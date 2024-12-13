package pilares;

public class Moto extends Veiculo {
    @Override
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Ligando a moto");
    }
    
    private void confereCombustivel(){
        System.out.println("Verificando combustível");
    }

    private void confereCambio(){
        System.out.println("Verificando câmbio");
    }
}
