package edu.joaquim7zz.intro_estruturas_condicionais;

/**public class CondicaoTernaria {
    public static void main(String[] args) {
        int nota = 6;

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);
    }

}**/

    public class CondicaoTernaria {
        public static void main(String[] args) {
            int nota = 7;

            String resultado = nota >= 7 ? "Aprovado" : nota >= 7 ? "Recuperaçao" : "Reprovado";

            System.out.println(resultado);
        }
    }

