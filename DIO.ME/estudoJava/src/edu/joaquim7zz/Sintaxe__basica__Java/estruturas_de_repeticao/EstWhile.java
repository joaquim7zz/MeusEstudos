package edu.joaquim7zz.Sintaxe__basica__Java.estruturas_de_repeticao;

import java.util.concurrent.ThreadLocalRandom;

public class EstWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();

            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho.");

            mesada -= valorDoce;
        }

        System.out.println("Mesada final: " + mesada);
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
