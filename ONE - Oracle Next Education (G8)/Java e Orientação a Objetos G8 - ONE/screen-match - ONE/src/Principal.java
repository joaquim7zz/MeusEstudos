import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

public class Principal  {
    public static void main(String[] args) {

    // Nome da classe > nome da "variável"
        Filme homiDeFerro = new Filme();

        homiDeFerro.setNome("homi de ferro");
        homiDeFerro.setAnoDeLancamento(2010);
        homiDeFerro.setDuracaoEmMinutos(135);
        homiDeFerro.setIncluidoNoPlano(true);

        homiDeFerro.exibeFichaTecnica();
        homiDeFerro.avalia(9);
        homiDeFerro.avalia(8);
        homiDeFerro.avalia(9);

        Filme miranha = new Filme();

        miranha.setNome("Miranha sem casa");
        miranha.setAnoDeLancamento(2020);
        miranha.setDuracaoEmMinutos(220);
        miranha.setIncluidoNoPlano(true);

        System.out.println("Média de avaliações do filme: " + homiDeFerro.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Perdido");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração lost: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(homiDeFerro);
        calculadora.inclui(miranha);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
    }
}
