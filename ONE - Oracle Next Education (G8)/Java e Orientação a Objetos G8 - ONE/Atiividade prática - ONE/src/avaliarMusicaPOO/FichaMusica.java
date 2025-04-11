package avaliarMusicaPOO;

public class FichaMusica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacao;
    int totalAvaliacao;

    void exibeFichaTecnica() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);

    }

    void avaliarMusica(double nota) {
        somaAvaliacao += nota;
        totalAvaliacao++;
    } 

    double mediaAvaliacao() {
       return somaAvaliacao / totalAvaliacao; 
    }
}
