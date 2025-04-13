package bancodigital;

/**
 *
 * @author Adeilson Valente
 */
public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;

    public ContaCorrente(String numero, String titular, double saldoInicial, double limiteChequeEspecial) {
        super(numero, titular, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && (getSaldo() + limiteChequeEspecial) >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
            return true;
        }
        System.out.println("Saldo insuficiente (incluindo cheque especial) ou valor inválido.");
        return false;
    }

    @Override
    public void aplicarRendimentos() {
        // Conta corrente normalmente n�o tem rendimentos
        System.out.println("Conta corrente não aplica rendimentos.");
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
}
