package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo.getNome());
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
