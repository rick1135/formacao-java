package aulaInterface.equipamentos.multifuncional;

import aulaInterface.equipamentos.digitalizadora.Digitalizadora;
import aulaInterface.equipamentos.copiadora.Copiadora;
import aulaInterface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Digitalizadora, Copiadora {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional...");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional...");
    }

    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional...");
    }
    
}
