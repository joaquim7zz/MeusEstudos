package edu.joaquim7zz.operadores;

public class Operadores {
    public static void main(String[] args) {
        // Operador de concatenação
        String nomeCompleto = "LINGUAGEM" + " " + "JAVA";
        System.out.println("Concatenação: " + nomeCompleto);

        // Operadores aritméticos
        int soma = 10 + 5;
        int subtracao = 10 - 5;
        int multiplicacao = 10 * 5;
        int divisao = 10 / 5;
        int moduloResto = 10 % 3;
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + moduloResto);

        // Operadores relacionais
        boolean maior = 10 > 5;
        boolean menor = 10 < 5;
        boolean igual = 10 == 5;
        boolean diferente = 10 != 5;
        System.out.println("Maior que: " + maior);
        System.out.println("Menor que: " + menor);
        System.out.println("Igual a: " + igual);
        System.out.println("Diferente de: " + diferente);

        // Operadores lógicos
        boolean and = (10 > 5) && (5 < 10);
        boolean or = (10 > 5) || (5 > 10);
        boolean not = !(10 > 5);
        System.out.println("Operador AND: " + and);
        System.out.println("Operador OR: " + or);
        System.out.println("Operador NOT: " + not);

        // Operador de incremento e decremento
        int numero = 5;
        numero++; // Incrementa 1
        System.out.println("Incremento: " + numero);
        numero--; // Decrementa 1
        System.out.println("Decremento: " + numero);
    }
}
