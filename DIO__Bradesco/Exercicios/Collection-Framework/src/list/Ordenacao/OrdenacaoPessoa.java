package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> pessoaPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> pessoaPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new CompararPorAltura() {});
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa pessoa = new OrdenacaoPessoa();

        pessoa.adicionarPessoa("nome 1", 12, 1.90);
        pessoa.adicionarPessoa("nome 2", 22, 1.78);
        pessoa.adicionarPessoa("nome 3", 33, 1.89);
        pessoa.adicionarPessoa("nome 4", 44, 1.91);

        System.out.println("Por idade \n" + pessoa.pessoaPorIdade());
        System.out.println("por altura \n" + pessoa.pessoaPorAltura());


    }

}
