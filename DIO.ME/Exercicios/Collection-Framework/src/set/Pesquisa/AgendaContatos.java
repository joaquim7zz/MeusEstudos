package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {

        Set<Contato> contatoPornome = new HashSet<>();
        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contatoPornome.add(contato);
            }
        }
        return contatoPornome;
    }

    public Contato atualizarNumerContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

}
