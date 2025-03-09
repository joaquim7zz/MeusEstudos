public class SmartTv {
    // Atributos da TV
    boolean ligada = false; // Estado inicial: desligada
    int canal = 1; // Canal inicial
    int volume = 25; // Volume inicial

    // Método para mudar para um canal específico
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    // Método para aumentar o volume
    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    // Método para diminuir o volume
    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }

    // Método para aumentar o canal
    public void aumentarCanal() {
        canal++;
    }

    // Método para diminuir o canal
    public void diminuirCanal() {
        canal--;
    }

    // Método para ligar a TV
    public void ligar() {
        ligada = true;
    }

    // Método para desligar a TV
    public void desligar() {
        ligada = false;
    }
}
