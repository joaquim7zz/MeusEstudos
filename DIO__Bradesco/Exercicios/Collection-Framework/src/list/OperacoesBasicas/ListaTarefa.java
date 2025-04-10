package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefaParaRemover = new ArrayList<>();

        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalDeTarefas() {
        return tarefaList.size();
    }

    public void obterDescricaoTarefa() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("TESTE");

        ListaTarefa lista = new ListaTarefa();

        while (lista.obterNumeroTotalDeTarefas() < 4) {
            System.out.println("Adicione uma tarefa que deseja adicionar: ");
            lista.adicionarTarefa(sc.next());
        }

//        lista.adicionarTarefa("joaquim");
//        lista.adicionarTarefa("joaquim sena");
//        lista.adicionarTarefa("joaquim de sena");
        System.out.println("Número de tarefas: " + lista.obterNumeroTotalDeTarefas());
        lista.obterDescricaoTarefa();



    }

}
