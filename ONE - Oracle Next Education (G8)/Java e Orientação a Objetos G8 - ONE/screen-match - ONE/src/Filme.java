public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    double somaDasavaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos; 


    void exibeFichaTecnica () {
    System.out.println("Nome do filme: " + nome);
    System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota) {
        somaDasavaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasavaliacoes / totalDeAvaliacoes;

    }

}
