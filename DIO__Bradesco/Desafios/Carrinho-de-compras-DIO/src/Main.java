public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Coxinha", 7d, 3);
        carrinhoDeCompras.adicionarItem("Cachorro quente", 10d, 3);
        carrinhoDeCompras.adicionarItem("Pão de queijo", 2d, 1);
        carrinhoDeCompras.adicionarItem("Pizza", 37d, 2);
        carrinhoDeCompras.adicionarItem("Pastel de flango", 5d, 2);


        carrinhoDeCompras.removerItem("Pão de queijo");

        carrinhoDeCompras.exibirItens();
        System.out.println("-----------------------------------------------");
        System.out.println("Valor total: " + carrinhoDeCompras.calcularValorTotal());



    }
}
