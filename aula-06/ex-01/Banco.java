public class Banco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Ana Souza", 1001, 500.00);
        System.out.println(conta);

        conta.depositar(250.50);
        conta.sacar(100);
        conta.sacar(5000);      // saldo insuficiente
        conta.depositar(-10);   // inválido
        System.out.println(conta);
        System.out.println("Saldo via getter: R$ " + conta.getSaldo());

        // Tentativa de alterar o saldo diretamente (NÃO compila):
        // conta.saldo = 1000000;
        //
        // Erro do compilador:
        // Banco.java:14: error: saldo has private access in ContaBancaria
        //         conta.saldo = 1000000;
        //              ^
    }
}
