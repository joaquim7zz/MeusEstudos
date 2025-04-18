public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton, 500);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.println("Histórico Conta Corrente:");
        cc.getHistorico().forEach(m -> System.out.println(m));

        System.out.println("Histórico Conta Poupança:");
        poupanca.getHistorico().forEach(m -> System.out.println(m));
    }
}
