package edu.joaquim7zz.Sintaxe__basica__Java.tipos_e_variaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        // Declaração de uma variável do tipo double para armazenar valores decimais
        double salarioMinimo = 2500.0;

        // Declaração de variáveis do tipo short e int para demonstrar conversões entre tipos
        short numeroCurto = 1; // short tem um menor intervalo de valores comparado ao int
        int numeroNormal = numeroCurto; // Conversão implícita (widening) de short para int
        short numeroCurto2 = (short) numeroNormal; // Conversão explícita (casting) de int para short

        // Exemplo de reatribuição de valor a uma variável
        int numero = 1; // Variável do tipo int recebe um valor inicial
        numero = 2; // O valor pode ser alterado, pois não é uma constante

        // Impressão do valor final da variável "numero"
        System.out.println("Valor da variável numero: " + numero);

        // Declaração de uma constante usando "final"
        final double VALOR_DE_PI = 3.14; // O uso de "final" impede que o valor seja modificado posteriormente
        // VALOR_DE_PI = 3.1415; // Isso causaria um erro de compilação, pois a constante não pode ser alterada
    }
}
