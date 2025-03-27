package contabanco;
import java.util.Scanner;

/**
 * 
 * @author Adeilson Valente
 */
public class ContaTerminal {

    public static void main(String[] args) {
        // Criar scanner para entrada de dados pelo terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitar e coletar as informa��es do usu�rio
        System.out.println("Por favor, digite o n�mero da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Consumir a quebra de linha pendente
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem de boas-vindas com os dados fornecidos
        System.out.println(
            "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque."
        );

        // Fechar o scanner
        scanner.close();
    }
}
