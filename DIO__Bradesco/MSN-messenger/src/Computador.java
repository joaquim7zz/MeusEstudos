import apps.Facebook;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class Computador {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
        /*
        * NÃO SE SABE QUAL APP
        * FOI ESCOLHIDO*/

        String appEscolhido = "msn";

        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fc")) {
            smi = new Facebook();
        } else if (appEscolhido.equals("tlg")) {
            smi = new Telegram();
        } else {
            System.out.println("App invalido");
        }
        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
