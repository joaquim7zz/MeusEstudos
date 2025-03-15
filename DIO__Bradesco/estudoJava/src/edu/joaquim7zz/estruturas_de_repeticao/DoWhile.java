package edu.joaquim7zz.estruturas_de_repeticao;


import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando");

        } while (tocando());
        System.out.println("Alô");
    }
    private  static boolean tocando() {
        boolean atendeu =  new Random().nextInt(3) == 1;
        System.out.println(atendeu);

        return ! atendeu;
    }
}
