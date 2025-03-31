package apps;

public class Facebook extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando Mensagem pelo apps.Facebook");
    }
    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo apps.Facebook");
    }

}
