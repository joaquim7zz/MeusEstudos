import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

public class Principal {
    public static void main(String[] args) {

        // Criação de objeto Filme
        Filme homiDeFerro = new Filme();
        homiDeFerro.setNome("homi de ferro");
        homiDeFerro.setAnoDeLancamento(2010);
        homiDeFerro.setDuracaoEmMinutos(135);
        homiDeFerro.setIncluidoNoPlano(true);
        homiDeFerro.exibeFichaTecnica();
        homiDeFerro.avalia(9);
        homiDeFerro.avalia(8);
        homiDeFerro.avalia(9);

        // Outro objeto Filme
        Filme miranha = new Filme();
        miranha.setNome("Miranha sem casa");
        miranha.setAnoDeLancamento(2020);
        miranha.setDuracaoEmMinutos(220);
        miranha.setIncluidoNoPlano(true);

        System.out.println("Média de avaliações do filme: " + homiDeFerro.pegaMedia());

        // Objeto Serie
        Serie lost = new Serie();
        lost.setNome("Perdido");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração total de Lost: " + lost.getDuracaoEmMinutos());

        // Calcula tempo total de exibição
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(homiDeFerro);
        calculadora.inclui(miranha);
        calculadora.inclui(lost);
        System.out.println("Tempo total de todos os títulos: " + calculadora.getTempoTotal());

        // Usa o filtro de recomendação (corrigido abaixo)
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(miranha); 

        // Criando episódio e aplicando filtro
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);  
    }
}
