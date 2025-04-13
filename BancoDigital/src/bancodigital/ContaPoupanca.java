package bancodigital;

/**
 *
 * @author Adeilson Valente
 */
public class ContaPoupanca extends Conta {

    private double taxaRendimento;

    public ContaPoupanca(String numero, String titular, double saldoInicial, double taxaRendimento) {
        super(numero, titular, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void aplicarRendimentos() {
        double rendimento = saldo * taxaRendimento;
        saldo += rendimento;
        System.out.println("Rendimento aplicado: " + rendimento);
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }
}
