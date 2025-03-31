package apps;

public class MSNMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo MSN");
    }
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo MSN");
    }

}
