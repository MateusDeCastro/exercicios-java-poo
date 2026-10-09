public class Geometria {
    public static void main(String[] args) {
        Retangulo[] retangulos = {
            new Retangulo(5, 3),
            new Retangulo(4, 4),
            new Retangulo(8, 2.5)
        };

        int numero = 1;
        for (Retangulo retangulo : retangulos) {
            System.out.printf("Retângulo %d - Área: %.2f%n",
                    numero, retangulo.calcularArea());
            System.out.printf("Perímetro: %.2f | É quadrado? %s%n",
                    retangulo.calcularPerimetro(),
                    retangulo.ehQuadrado() ? "Sim" : "Não");
            System.out.println("------------------------------");
            numero++;
        }
    }
}
