import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int chute = 0;
        int tentativas = 0;

        System.out.println(numeroAleatorio);
        while (tentativas <= 5) {
            System.out.println("Digite um número para tentar: " );
            chute = scanner.nextInt();
            tentativas++;

            if (chute > numeroAleatorio) {
                System.out.println("O número aleatório é menor que " + chute);
            } else if (chute < numeroAleatorio) {
                System.out.println("O númrero aleatório é maior que " + chute);
            } else {
                System.out.println("VOCÊ ACERTOUUU COM " + tentativas + " TENTATIVAS");
            }

        }
            System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroAleatorio);




    }
}