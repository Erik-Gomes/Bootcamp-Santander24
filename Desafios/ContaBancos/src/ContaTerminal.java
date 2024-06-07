import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //ToDo: Conhecer e importar a classe Scanner
        //Exibir as mensagens de entrada para o usuario
        //Obter pelo Scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe os digitos da Agencia: ");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Informe seu nome e sobrenome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponivel para saque.");
    }
}
