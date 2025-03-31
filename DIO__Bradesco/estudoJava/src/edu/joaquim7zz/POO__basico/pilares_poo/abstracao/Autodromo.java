package edu.joaquim7zz.POO__basico.pilares_poo.abstracao;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("54844156");
        jeep.ligar();

        Moto xj6 = new Moto();
        xj6.setChassi("546365");
        xj6.ligar();

        Veiculo coringa = xj6;
        coringa.ligar();
    }
}
