package candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        String [] candidatos = {"Arthur", "Barbara", "Carlos", "Daniel", "Erik"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);

        }

    }

    static void entrandoEmContato(String candidato) {
        int tentativas = 1;
        boolean continua = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continua = !atendeu;
            if (continua) {
                tentativas++;
            } else {
                System.out.println("CONTATO REALIZADO");
            }
        } while (continua && tentativas < 3);

        if (atendeu) {
            System.out.println("CONTATO REALIZADO COM " + candidato + " APOS " + tentativas);
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " APOS " + tentativas);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void selecaoCandidatos () {
        String [] candidatos = {"Arthur", "Barbara", "Carlos", "Daniel", "Erik", "Fernanda", "Gustavo", "Hugo", "Isabela", "Joaquim", "Kayky"};

        int candidatosSelecionados = 0;
        int canditadosAtual = 0;
        double salarioBase = 2000.00;

        while (candidatosSelecionados < 5 && canditadosAtual < candidatos.length) {
            String candidato = candidatos[canditadosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato: " + candidato + " solicitou esse valor de salario: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidado: " + candidato + " foi selecionado com sucesso! ");
                candidatosSelecionados++;

            }
            canditadosAtual++;
        }
        System.out.println("Lista de candidatos: ");
    }

    static double valorPretendido () {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O  CANDIDATO");
        } else if(salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM UMA CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DE OUTROS CANDIDATOS");
        }
    }
}
