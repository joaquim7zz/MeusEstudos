package edu.joaquim7zz.POO__basico.pilares_poo.encapsulamento;

public class Carro {
        public void ligar() {
            confereCambio();
            confereCombustivel();
            System.out.println("CARRO LIGADO");
        }
        private void confereCombustivel() {
            System.out.println("CONFERINDO COMBUSTIVEL");
        }

        private void confereCambio() {
            System.out.println("cambio em P");
        }
}

