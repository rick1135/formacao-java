package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("Controlando entrada de ingredientes");
    }
    private void controlarSaida(){
        System.out.println("Controlando saída de ingredientes");
    }
    void entregarIngredientes(){
        System.out.println("Entregando ingredientes");
        controlarSaida();
    }
    void trocarGas(){
        System.out.println("Almoxarife trocando gás");
    }
}
