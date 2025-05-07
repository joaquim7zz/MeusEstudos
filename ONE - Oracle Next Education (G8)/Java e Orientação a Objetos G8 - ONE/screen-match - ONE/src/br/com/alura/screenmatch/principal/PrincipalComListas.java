package br.com.alura.screenmatch.principal;

import java.util.ArrayList;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme homiDeFerro = new Filme("Homi de ferro", 2010);
        homiDeFerro.avalia(9);
        Filme miranha = new Filme("Miranha sem casa", 2020);
        miranha.avalia(8);
        Filme outroFilme = new Filme("Dogville", 2003); 
        outroFilme.avalia(10);
        Serie lost = new Serie("perdido", 200);
        lost.avalia(7);

        ArrayList <Titulo> lista = new ArrayList<>(); 
        lista.add(homiDeFerro);
        lista.add(miranha);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo itemTitulo : lista) {
            System.out.println(itemTitulo.getNome());
            if (itemTitulo instanceof Filme filme) {
                System.out.println(filme.getClassificacao());
            } else {
                System.out.println("É uma serie");
            }
        }


    }

            
    
}
