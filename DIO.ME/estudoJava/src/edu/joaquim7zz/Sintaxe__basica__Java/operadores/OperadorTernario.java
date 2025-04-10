package edu.joaquim7zz.Sintaxe__basica__Java.operadores;

public class OperadorTernario {
    public static void main(String[] args) {
        // Declaração e inicialização das variáveis
        int a = 5;
        int b = 6;

        // Operador ternário para verificar se 'a' é igual a 'b'
        // Sintaxe: (condição) ? valor_se_verdadeiro : valor_se_falso;
        String resultado = a == b ? "Verdadeiro" : "Falso";

        System.out.println("Resultado da comparação: " + resultado);
    }
}
