public class Referencia {
    public static void main(String[] args) {
        ContaBancaria conta1 =
                new ContaBancaria("Carlos Lima", 9876, 100.00);

        ContaBancaria conta2 = conta1;

        conta2.depositar(50.00);

        System.out.printf("Saldo pela primeira variável: R$ %.2f%n",
                conta1.getSaldo());

        ContaBancaria contaNula = null;
        contaNula.exibirExtrato(); 
    //Exception in thread "main" java.lang.NullPointerException: 
    // Cannot invoke "ContaBancaria.exibirExtrato()" because "<local3>" is null
    // at Referencia.main(Referencia.java:18) 
    }
}
