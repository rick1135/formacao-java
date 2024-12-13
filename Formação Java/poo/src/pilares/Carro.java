package pilares;

public class Carro extends Veiculo{
    @Override
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Ligando o carro");
    }
    
    private void confereCombustivel(){
        System.out.println("Verificando combustível");
    }

    private void confereCambio(){
        System.out.println("Verificando câmbio");
    }
}
