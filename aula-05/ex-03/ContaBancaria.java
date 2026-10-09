public class ContaBancaria {
    private String titular;
    private int numero;
    private double saldo;

    public ContaBancaria(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void exibirExtrato() {
        System.out.println("Titular: " + titular);
        System.out.println("Número: " + numero);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}
