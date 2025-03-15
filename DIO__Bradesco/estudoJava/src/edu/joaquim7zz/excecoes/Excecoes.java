package edu.joaquim7zz.excecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Excecoes {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite o nome do aluno: ");
            String nome = sc.next();

            System.out.println("Digite o sobrenome do aluno: ");
            String sobrenome = sc.next();

            System.out.println("Digite a idade do aluno: ");
            int idade = sc.nextInt();

            System.out.println("Nome do aluno: " + nome);
            System.out.println("Sobrenome do aluno: " + sobrenome);
            System.out.println("Idade do aluno: " + idade);
            sc.close();
        }catch(InputMismatchException e) {}
            System.out.println("Os campo idade e altura precisam ser numéricos");
    }
}
