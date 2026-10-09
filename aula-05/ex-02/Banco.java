public class Banco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Ana Souza", 12345, 500.00);

        conta.exibirExtrato();

        // Cenário 1: há saldo suficiente.
        conta.sacar(200.00);
        conta.exibirExtrato();

        // Cenário 2: não há saldo suficiente.
        conta.sacar(1000.00);
        conta.exibirExtrato();
    }
}
