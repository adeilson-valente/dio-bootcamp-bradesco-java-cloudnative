package bancodigital;

/**
 *
 * @author Adeilson Valente
 */
public class BancoDigital {

    public static void main(String[] args) {
        Conta corrente = new ContaCorrente("123", "João", 1000, 500);
        Conta poupanca = new ContaPoupanca("456", "Maria", 2000, 0.005);

        corrente.depositar(500);
        corrente.sacar(200);
        corrente.transferir(300, poupanca);

        ((ContaPoupanca) poupanca).aplicarRendimentos();

        System.out.println("Saldo conta corrente: " + corrente.getSaldo());
        System.out.println("Saldo conta poupança: " + poupanca.getSaldo());
    }
}
