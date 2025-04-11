import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme: ");
            nota = scanner.nextDouble();
            if (nota != -1) {
                mediaAvaliacao += nota;
                totalNotas++;
            }
        }

        System.out.println(mediaAvaliacao / totalNotas);
    }
}
