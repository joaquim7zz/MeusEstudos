package edu.joaquim7zz.Sintaxe__basica__Java.scanner;

import java.util.Scanner; // Importação da classe Scanner

public class ScanInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Criando um objeto Scanner

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Lê uma linha de texto

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // Lê um número inteiro

        System.out.println("Nome: " + nome + ", Idade: " + idade); // Exibe os dados inseridos

        scanner.close(); // Fecha o Scanner para evitar vazamentos de recursos
    }
}
