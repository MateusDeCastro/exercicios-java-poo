public class Conversor {
    public static void main(String[] args) {

        final double COTACAO = 5.42;
        double dolares = 100.0;

        double reais = dolares * COTACAO;

        System.out.printf("US$ %.2f = R$ %.2f\n", dolares, reais);

        double celsius = 25.0;

        // 9/5 resulta em 1 porque ambos são inteiros.
        // Usando 9.0/5, o Java faz divisão com ponto flutuante.
        double fahrenheit = celsius * 9.0 / 5 + 32;

        System.out.printf("%.2f °C = %.2f °F", celsius, fahrenheit);
    }
}