package Desconto;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        double desconto = 10;


        System.out.println("Digite o valor da compra: ");
        valor = sc.nextInt();

        if (valor >= 100 ) {
            double totDesconto = valor * (desconto / 100);
            System.out.println(desconto);
            System.out.println("Desconto de 10% aplicado");
            System.out.println("Novo valor R$: " + (valor - totDesconto));
        } else {
            System.out.println("Nenhumm desconto aplicado");
            System.out.println("Valor total: R$ " + valor);
        }
        sc.close();
    }
}
