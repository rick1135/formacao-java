package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    public void adicionarLancheNoBalcao() {
        System.out.println("Lanche adicionado no balcão");
    }
    public void adicionarSucoNoBalcao() {
        System.out.println("Suco adicionado no balcão");
    }
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche() {
        System.out.println("Lanche preparado");
    }
    private void prepararVitamina() {
        System.out.println("Vitamina preparadas");
    }
    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesLanche() {
        System.out.println("Ingredientes selecionados");
    }
    private void selecionarIngredientesVitamina() {
        System.out.println("Ingredientes selecionados");
    }
    private void lavarIngredientes() {
        System.out.println("Ingredientes lavados");
    }
    private void baterVitaminaLiquidificador() {
        System.out.println("Vitamina batida no liquidificador");
    }
    public void fritarIngredientesLanche() {
        System.out.println("Ingredientes fritos");
    }
    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes(Almoxarife meuAmigo){
        meuAmigo.entregarIngredientes();
    }

}
