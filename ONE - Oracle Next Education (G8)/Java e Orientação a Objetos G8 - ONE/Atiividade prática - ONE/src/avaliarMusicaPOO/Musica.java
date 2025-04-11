package avaliarMusicaPOO;

public class Musica {
    public static void main(String[] args) {

        FichaMusica ficha = new FichaMusica(); 

        ficha.titulo = "Solto";
        ficha.artista = "Djonga";
        ficha.anoLancamento = 2020;

        ficha.exibeFichaTecnica();
        
        ficha.avaliarMusica(9.0);
        ficha.avaliarMusica(9.0);
        ficha.avaliarMusica(9.0);

        double mediaAvaliacao = ficha.mediaAvaliacao();
        System.out.println(mediaAvaliacao);


    }
}
