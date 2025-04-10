package edu.joaquim7zz.Sintaxe__basica__Java.Metodos;

public class Metodos {
    public static void main(String[] args) {
        //Chamando métodos para demonstração
        saudacao();
        int resultadoSoma = soma(5, 10);
        System.out.println("Resultado da soma: " + resultadoSoma);

        boolean par = ehPar(4);
        System.out.println("O número 4 é par? " + par);
    }

    //Método sem retorno e sem parâmetros
    public static void saudacao() {
        System.out.println("Olá! Bem-vindo ao exemplo de métodos.");
    }

    //Método com retorno e parâmetros
    public static int soma(int a, int b) {
        return a + b;
    }

    //Método que retorna um booleano
    public static boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
}
