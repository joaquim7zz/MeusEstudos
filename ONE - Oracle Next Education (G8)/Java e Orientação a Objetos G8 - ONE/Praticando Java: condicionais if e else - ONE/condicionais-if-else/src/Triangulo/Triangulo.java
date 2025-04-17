package Triangulo;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite o primeiro lado: ");
        int lado1 = sc.nextInt();
        System.out.printf("Digite o segundo lado: ");
        int lado2 = sc.nextInt();
        System.out.printf("Digite o terceiro lado: ");
        int lado3 = sc.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.printf("Os lados podem formar um triângulo.");
        } else {
            System.out.printf("Os lados não podem formar um triângulo.");
        }
        sc.close();
    }
}
