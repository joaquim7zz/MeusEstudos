import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeDoCliente = "Joaquim de Sena";
        String tipoDeConta = "Corrente";
        double saldoInicial = 2500;
        double adicionalSaldo = 0;
        double tranfereSaldo = 0;
        int operacaoConta = 0;

        System.out.println("************************************");
        System.out.println("""
                Nome:          %s
                Tipo de conta: %s
                Saldo Inicial: %.2f
                ************************************
                """.formatted(nomeDoCliente, tipoDeConta, saldoInicial));

        String menu = """
                
                Operações
                
                1 - Consultar Saldo
                2 - Receber Valor
                3 - Transferir valor
                4 - Sair
                
                Digite a opçẽo desejada:
                """;

        do {
            System.out.println(menu);
            operacaoConta = scanner.nextInt();
            switch (operacaoConta) {
                case 1:
                    System.out.println("O saldo atual é de " + saldoInicial);
                    break;
                case 2:
                    System.out.println("Digite o valor a receber: ");
                    adicionalSaldo = scanner.nextDouble();
                    System.out.println("Valor recebido: " + adicionalSaldo);
                    System.out.println("Saldo atualizado " + saldoInicial);
                    break;
                case 3:
                    System.out.println("Informe o valor que desaja transferir: ");
                    tranfereSaldo = scanner.nextDouble();
                    if (tranfereSaldo > adicionalSaldo) {
                        System.out.println("Saldo insuficiente para realizar tranferência.");
                    } else {
                        saldoInicial -= tranfereSaldo;
                        System.out.println("Saldo atualizado " + saldoInicial);
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (operacaoConta != 4);


    }
}