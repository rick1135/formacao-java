import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Iniciando o processo seletivo!");
        String[] candidatos = { "João", "Maria", "José", "Ana", "Carlos" };
        
        for(String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato){
        System.out.println("Entrando em contato com o candidato " + candidato);
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)tentativasRealizadas++;
            else System.out.println("O candidato " + candidato + " atendeu após " + tentativasRealizadas + " tentativas");
        }while(continuarTentando && tentativasRealizadas<3);
        
        if(!atendeu) System.out.println("O candidato " + candidato + " não atendeu após 3 tentativas");
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "João", "Maria", "José", "Ana", "Carlos" };
        System.out.println("Imprimindo a lista de candidatos selecionados:");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de numero " + (i) + "é o candidato " + candidatos[i + 1]);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "João", "Maria", "José", "Ana", "Carlos", "Beatriz", "Pedro", "Mariana", "Paulo",
                "Luana" };
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
            System.out.println("Candidato: " + candidato + " Salario Pretendido: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado!");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO!");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA!");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS!");
        }
    }
}
