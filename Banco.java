import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        String nomeDoCliente = "Helbert Luiz de Abreu";
        String tipoDeConta = "Corrente";
        double saldo = 2500;
        int opcao = 0;

        System.out.println("******************************");
        System.out.println(nomeDoCliente);
        System.out.println(tipoDeConta);
        System.out.println(" ");
        System.out.println("Seu saldo atual é de R$" + saldo);
        System.out.println("******************************");

        String tiposDeOperacoes = """
                Operações
                
                1 - Consultar Saldos
                2 - Receber Valor
                3 - Transferir Valor
                4 - Sair
                """;

        Scanner menuDeEscolha = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(tiposDeOperacoes);
            System.out.println("Escolha uma opção para continuar:");

            int menuEscolhido = menuDeEscolha.nextInt();

            if (menuEscolhido == 1) {
                System.out.println("Seu saldo é de R$" + saldo);
            } else if (menuEscolhido == 2) {
                System.out.println("Digite o valor a receber:");
                double valorRecebido = menuDeEscolha.nextDouble();
                saldo += valorRecebido;
                System.out.println("Você acabou de receber R$" + valorRecebido);
                System.out.println("O seu saldo é de R$"+ saldo);
            } else if (menuEscolhido == 3) {
                System.out.println("Digite o valor que deseja tranferir:");
                double valorTransferido = menuDeEscolha.nextDouble();
                if (saldo >= valorTransferido) {
                    saldo -= valorTransferido;
                    System.out.println("Transferência realizada com sucesso;");
                    System.out.println("O seu saldo é de R$"+ saldo);
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            } else if (opcao != 4) {
                System.out.println("Opção inválida. Digite uma opção válida para continuar.");
            }
        }
    }
}
