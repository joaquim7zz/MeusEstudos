import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> removerItem = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                if (item.getNome().equals(nome)) {
                    removerItem.add(item);
                }
            }
            itemList.removeAll(removerItem);
        } else {
            System.out.println("Lista vazia");
        }

    }

    public double calcularValorTotal() {
        double total = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valor = item.getPreco() * item.getQuantidade();
                total += valor;
            }
        }
        return total;
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("Lista vazia");
        }

    }



}
