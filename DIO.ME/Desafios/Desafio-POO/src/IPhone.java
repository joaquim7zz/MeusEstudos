public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorDeInternet {

    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void desligar() {
        System.out.println("Desligando chamada");
    }


    public void exibirPagina(String url) {
        System.out.println("Abrindo navegador de internet");
        System.out.println("Exibindo página: " + url);
    }


    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
}