public class Loja {
    public static void main(String[] args) {
        System.out.println("=== Caminho 1: preço inválido ===");
        Produto caneta = new Produto("Caneta", -5.0);   // inválido já na criação
        System.out.println(caneta);                     // preço fica 0.0

        Produto caderno = new Produto("Caderno", 18.90);
        caderno.adicionarEstoque(5);
        System.out.println(caderno);

        caderno.setPreco(0);                            // inválido: mantém 18.9
        caderno.setPreco(-2);                           // inválido: mantém 18.9
        System.out.println(caderno);
        caderno.setPreco(20.00);                        // válido
        System.out.println(caderno);

        System.out.println("\n=== Caminho 2: venda maior que o estoque ===");
        boolean ok = caderno.vender(8);
        System.out.println("Venda realizada? " + ok);
        System.out.println(caderno);

        System.out.println("\n=== Caminho 3: venda válida ===");
        ok = caderno.vender(3);
        System.out.println("Venda realizada? " + ok);
        System.out.println(caderno);

        System.out.println("\n=== Extras: estoque e quantidade inválidos ===");
        caderno.adicionarEstoque(-4);
        caderno.vender(0);
        caderno.vender(2);                              // vende o que resta
        caderno.vender(1);                              // estoque zerado
        System.out.println(caderno);
    }
}