import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Qual operação bancaria deseja realizar?\n");
            System.out.println("1 Depositar");
            System.out.println("2 Saquar");
            System.out.println("3 Consultar saldo");
            System.out.println("0 Encerrar\n");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Qual o valor deseja depositar:");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + saldo + "\n");
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Qual o valor deseja sacar:");
                    double saque = scanner.nextDouble();

                    if(saque>saldo)
                        System.out.println("Saldo insulficiente\n");
                    else
                        System.out.println("Saldo atual: " + (saldo-saque));

                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Saldo atual: " + saldo + "\n");
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
        }
        scanner.close();
    }
}
