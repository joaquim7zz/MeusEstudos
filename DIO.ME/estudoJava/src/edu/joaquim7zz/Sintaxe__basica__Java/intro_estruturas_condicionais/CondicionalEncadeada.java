package edu.joaquim7zz.Sintaxe__basica__Java.intro_estruturas_condicionais;

public class CondicionalEncadeada {
    public static void main(String[] args) {
        int nota = 6;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
