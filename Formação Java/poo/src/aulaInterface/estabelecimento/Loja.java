package aulaInterface.estabelecimento;

import aulaInterface.equipamentos.copiadora.Copiadora;
import aulaInterface.equipamentos.digitalizadora.Digitalizadora;
import aulaInterface.equipamentos.impressora.Impressora;
import aulaInterface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Loja {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;
        
        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
