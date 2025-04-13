package bancodigital;

/**
 *
 * @author Adeilson Valente
 */
public abstract class Conta {

    private String numero;
    private String titular;
    protected double saldo;

    public Conta(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso.");
        }
        else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
            return true;
        }
        System.out.println("Saldo insuficiente ou valor inválido.");
        return false;
    }

    public boolean transferir(double valor, Conta destino) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso.");
            return true;
        }
        System.out.println("Transferência não realizada.");
        return false;
    }

    public abstract void aplicarRendimentos();
}
