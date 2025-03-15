package edu.joaquim7zz.intro_estruturas_condicionais;

public class CondicionalSimples {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicidado = 17.0;

        if (valorSolicidado < saldo) {
            saldo = saldo - valorSolicidado;

            System.out.println(saldo);
        }
    }
}
