public class Main {
    public static void main(String[] args) {

        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        int classificacao;
        classificacao = (int) (media / 2);
        String sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom
                """;

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Média: "+ media);
        System.out.println("Sinopse: " + sinopse);
        System.out.println("Classificacao: " + classificacao);

    }
}