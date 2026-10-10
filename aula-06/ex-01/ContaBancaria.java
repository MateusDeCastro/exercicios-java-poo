public class ContaBancaria {
    private String titular;
    private int numero;
    private double saldo;

    public ContaBancaria(String titular, int numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial >= 0 ? saldoInicial : 0;
    }

    public String getTitular() { return titular; }
    public int getNumero()     { return numero; }
    public double getSaldo()   { return saldo; }

    public boolean depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Depósito inválido: o valor deve ser positivo.");
            return false;
        }
        saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Saque inválido: o valor deve ser positivo.");
            return false;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para sacar R$ " + String.format("%.2f", valor));
            return false;
        }
        saldo -= valor;
        return true;
    }

    @Override
    public String toString() {
        return String.format("Conta %d | Titular: %s | Saldo: R$ %.2f", numero, titular, saldo);
    }
}
