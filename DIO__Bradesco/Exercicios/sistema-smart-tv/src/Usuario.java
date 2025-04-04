public class Usuario {
    public static void main(String[] args) {
        // Criando uma instância da SmartTv
        SmartTv smartTv = new SmartTv();

        // Exibindo o estado inicial da TV
        System.out.println("TV ligada? : " + smartTv.ligada);
        System.out.println("Canal atual? : " + smartTv.canal);
        System.out.println("Volume atual? : " + smartTv.volume);

        // Ligando a TV
        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada? : " + smartTv.ligada);

        // Alterando o volume
        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume atual: " + smartTv.volume);

        // Diminuindo o volume várias vezes
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo Status -> Volume final: " + smartTv.volume);
    }
}
