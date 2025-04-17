package ComparandoNumeros;

import java.util.Scanner;

public class Comparar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número é " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é " + num2);
        } else {
            System.out.println("Os número são iguais");
        }
        sc.close();
    }
}
