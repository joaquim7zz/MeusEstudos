package edu.joaquim7zz.operadores;

public class Booleano {
    public static void main(String[] args) {
        // Declaração de variáveis booleanas
        boolean verdadeiro = true;
        boolean falso = false;

        // Operadores lógicos
        boolean resultadoAnd = verdadeiro && falso; // false (ambos precisam ser true)
        boolean resultadoOr = verdadeiro || falso; // true (basta um ser true)
        boolean resultadoNot = !verdadeiro; // false (negação do valor booleano)
        boolean resultadoXor = verdadeiro ^ falso; // true (diferentes retornam true)

        // Comparações booleanas
        int a = 10, b = 20;
        boolean maior = a > b; // false
        boolean menor = a < b; // true
        boolean igual = a == b; // false
        boolean diferente = a != b; // true

        // Impressão dos resultados
        System.out.println("Valor de verdadeiro: " + verdadeiro);
        System.out.println("Valor de falso: " + falso);
        System.out.println("Operador AND (true && false): " + resultadoAnd);
        System.out.println("Operador OR (true || false): " + resultadoOr);
        System.out.println("Operador NOT (!true): " + resultadoNot);
        System.out.println("Operador XOR (true ^ false): " + resultadoXor);

        // Impressão dos resultados das comparações
        System.out.println("10 > 20: " + maior);
        System.out.println("10 < 20: " + menor);
        System.out.println("10 == 20: " + igual);
        System.out.println("10 != 20: " + diferente);
    }
}
