package MediaAprovacao;

public class Media {
    public static void main(String[] args) {
        int nota1 = 7;
        int nota2 = 5;
        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("O estudante teve média " + media + " e foi aprovado.");
        } else if (media > 5 && media < 7) {
            System.out.println("O estudante teve média " + media + " e está em recuperação.");
        } else {
            System.out.println("O estudante teve média " + media + " e foi reprovado.");
        }
    }
}
