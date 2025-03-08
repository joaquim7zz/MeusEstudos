package edu.joaquim7zz.anatomia_das_classes;

public class Boletim {
    public static void main(String[] args) {
        // Declaração de variável para armazenar a média final do aluno
        int mediaFinal = 6;

        // Estrutura condicional para verificar a situação do aluno com base na média
        if (mediaFinal < 6) {
            System.out.println("Reprovado"); // Se a média for menor que 6, o aluno está reprovado
        } else if (mediaFinal == 6) {
            System.out.println("Prova Minerva"); // Se a média for exatamente 6, o aluno tem direito a uma prova extra
        } else {
            System.out.println("Aprovado"); // Se a média for maior que 6, o aluno está aprovado
        }
    }
}
