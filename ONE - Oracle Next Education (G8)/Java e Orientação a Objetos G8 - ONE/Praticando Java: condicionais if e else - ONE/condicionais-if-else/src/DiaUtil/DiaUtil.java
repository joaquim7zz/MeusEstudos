package DiaUtil;

import java.util.Scanner;

public class DiaUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o dia da semana: ");
        String diaSemana = sc.nextLine();
        sc.close();

        if (diaSemana.equalsIgnoreCase("domingo") || diaSemana.equalsIgnoreCase("sabado")) {
            System.out.println(diaSemana + " não é um dia útil");
        } else {
            System.out.printf(diaSemana + " é um dia da semana");
        }


    }
}
