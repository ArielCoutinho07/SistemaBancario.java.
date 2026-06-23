import java.util.Scanner;

public class SistemaBancario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String titular = "Ariel Coutinho";
        double saldo = 1000.00;
        int opcao;

        do {
            System.out.println("\n===== BANCO DIGITAL =====");
            System.out.println("Titular: " + titular);
            System.out.println("Saldo: R$ " + saldo);
            System.out.println("-------------------------");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo atual é: R$ " + saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = scanner.nextDouble();

                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor inválido.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor para saque: R$ ");
                    double saque = scanner.nextDouble();

                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente ou valor inválido.");
                    }
                    break;

                case 4:
                    System.out.println("Obrigado por utilizar o Banco Digital!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}
