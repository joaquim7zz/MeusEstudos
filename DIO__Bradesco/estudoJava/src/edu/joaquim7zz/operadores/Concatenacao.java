package edu.joaquim7zz.operadores;

public class Concatenacao {
    public static void main(String[] args) {
        // Declaração da variável de concatenação
        String concatenacao;

        // Soma os primeiros valores numéricos e depois concatena com a string
        concatenacao = 1 + 1 + 1 + "1"; // (1+1+1) -> 3, depois "3" + "1" -> "31"
        System.out.println(concatenacao);

        // Primeiro número é somado com a string, convertendo tudo em string a partir daí
        concatenacao = 1 + "1" + 1 + 1; // "1" + "1" -> "11", "11" + "1" -> "111", "111" + "1" -> "1111"
        System.out.println(concatenacao);

        // Cada número após a string é tratado como string e concatenado
        concatenacao = 1 + "1" + 1 + "1"; // "1" + "1" -> "11", "11" + "1" -> "111", "111" + "1" -> "1111"
        System.out.println(concatenacao);

        // Começa com uma string, então tudo é concatenado como string
        concatenacao = "1" + 1 + 1 + 1; // "1" + "1" -> "11", "11" + "1" -> "111", "111" + "1" -> "1111"
        System.out.println(concatenacao);

        // Parênteses alteram a precedência, forçando a soma antes da concatenação
        concatenacao = "1" + (1 + 1 + 1); // "1" + "3" -> "13"
        System.out.println(concatenacao);
    }
}