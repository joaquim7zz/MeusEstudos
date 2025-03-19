package edu.joaquim7zz.Sintaxe__basica__Java.estruturas_de_repeticao;

public class ForEmArrays {
    public static void main(String[] args) {
        String alunos [] = { "Felipe", "Joaquim", "Julia", "Isabela"};

        for (String aluno : alunos) {
            System.out.println("O nome do aluno é " + aluno );
        }

    }
    }

    /*
     * for (int i = 0; i < alunos.length; i++) {
     *             System.out.println("O aluno no indice " + i + " é " + alunos[i] );
     *         }
     * **/