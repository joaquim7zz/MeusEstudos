package IntervaloImprestimo;


import java.util.Scanner;

public class Intevalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o valor do empréstimo: ");
        double valor = sc.nextDouble();

        if (valor >= 1000 && valor <= 5000 ) {
            System.out.printf("o valor %.2f, está dentro do intervalor permitido para empréstimo.".formatted(valor));
        } else {
            System.out.printf("o valor %.2f, não está dentro do intervalor permitido para empréstimo.".formatted(valor));
        }
        sc.close();

    }
}
