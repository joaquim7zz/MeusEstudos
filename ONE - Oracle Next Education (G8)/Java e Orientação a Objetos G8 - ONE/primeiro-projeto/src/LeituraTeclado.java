import java.util.Scanner;

public class LeituraTeclado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu filme favorto: ");
        String filme = scanner.nextLine();
        System.out.println("Digite o ano do filme: ");
        int ano = scanner.nextInt();
        System.out.println("Diga sua avaliação para o filme: ");
        double avaliacao = scanner.nextDouble();
        scanner.close();

        System.out.println(filme);
        System.out.println(ano);
        System.out.println(avaliacao);
    }
}
