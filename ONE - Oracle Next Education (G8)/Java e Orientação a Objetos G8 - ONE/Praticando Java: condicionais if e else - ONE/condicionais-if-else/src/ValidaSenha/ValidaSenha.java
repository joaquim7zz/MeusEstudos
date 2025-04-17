package ValidaSenha;

import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha = "12345";
        String tentarSenha = "";

        System.out.println("Digite a senha de acesso: ");
        tentarSenha = scanner.nextLine();

        if (tentarSenha.equals(senha)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
