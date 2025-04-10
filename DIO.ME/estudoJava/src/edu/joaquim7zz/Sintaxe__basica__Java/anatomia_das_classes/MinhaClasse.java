package edu.joaquim7zz.Sintaxe__basica__Java.anatomia_das_classes;

public class MinhaClasse {
    public static void main(String[] args) {
        // Declaração e inicialização de variáveis para armazenar o nome e sobrenome
        String primeiroNome = "Joaquim";
        String segundoNome = "Sena";

        // Chamada do método nomeCompleto para concatenar os nomes
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        // Exibição do nome completo no console
        System.out.println("Nome completo: " + nomeCompleto);
    }

    // Método para concatenar dois nomes e formar o nome completo
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome + " " + segundoNome; // Concatenação usando operador +
    }
}
