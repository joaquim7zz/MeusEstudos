public class Main {
    public static void main(String[] args) {
        IPhone meuIphone = new IPhone();

        System.out.println("------------------------------------------");

        meuIphone.selecionarMusica("Hino do corinthians");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println("------------------------------------------");

        meuIphone.ligar("4002-8922");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        meuIphone.desligar();

        System.out.println("------------------------------------------");

        meuIphone.exibirPagina("https://github.com/joaquim7zz");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}