package Compatibilidade;

import java.util.Scanner;

public class Doacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade do doador: ");
        int idade = scanner.nextInt();

        System.out.print("Digite o peso do doador (em kg): ");
        double peso = scanner.nextDouble();

        boolean idadeValida = idade >= 18 && idade <= 65;
        boolean pesoValido = peso > 50;

        if (idadeValida && pesoValido) {
            System.out.println("O doador é compatível para doação de sangue.");
        } else {
            System.out.println("O doador não é compatível. Motivo:");
            if (!idadeValida) {
                System.out.println("- Deve ter entre 18 e 65 anos.");
            }
            if (!pesoValido) {
                System.out.println("- Deve pesar mais de 50 kg.");
            }
            scanner.close();
        }

        }
    }
