public class ContaBancaria {
    private String titular;
    private int numero;
    private double saldo;

    public ContaBancaria(String titular, int numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado.%n", valor);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("O valor do saque deve ser positivo.");
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado.%n", valor);
        } else {
            System.out.println("Saldo insuficiente. Saque não realizado.");
        }
    }

    public void exibirExtrato() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da conta: " + numero);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
        System.out.println("------------------------------");
    }

    public double getSaldo() {
        return saldo;
    }
}
