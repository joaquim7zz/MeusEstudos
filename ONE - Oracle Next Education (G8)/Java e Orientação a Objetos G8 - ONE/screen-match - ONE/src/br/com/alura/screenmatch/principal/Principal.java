package br.com.alura.screenmatch.principal;
import java.util.ArrayList;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

public class Principal {
    public static void main(String[] args) {

        // Criação de objeto Filme
        Filme homiDeFerro = new Filme("Homi de ferro", 2010);
        homiDeFerro.setDuracaoEmMinutos(135);
        homiDeFerro.setIncluidoNoPlano(true);
        homiDeFerro.exibeFichaTecnica();
        homiDeFerro.avalia(9);
        homiDeFerro.avalia(8);
        homiDeFerro.avalia(9);

        // Outro objeto Filme
        Filme miranha = new Filme("Miranha sem casa", 2020);
        miranha.setDuracaoEmMinutos(220);
        miranha.setIncluidoNoPlano(true);

        System.out.println("Média de avaliações do filme: " + homiDeFerro.pegaMedia());

        // Objeto Serie
        Serie lost = new Serie("perdido", 200);
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

        Filme outroFilme = new Filme("Dogville", 2003); 
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.avalia(10);

        ArrayList <Filme> listaDeFilmes = new ArrayList<>(); 
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(homiDeFerro);
        listaDeFilmes.add(miranha);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes.toString());

    }
}
