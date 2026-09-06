public class Refatorar {

    public static int Soma(int[] valores) {
        int soma = 0;
        for (int v : valores) {
            soma += v;
        }
        return soma;
    }

    public static int Maior(int[] valores) {
        int maior = valores[0];
        for (int v : valores) {
            if (v > maior) {
                maior = v;
            }
        }
        return maior;
    }

    public static int Pares(int[] valores) {
        int pares = 0;
        for (int v : valores) {
            if (v % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }

    public static void main(String[] args) {
        int[] valores = {4, 7, 2, 9, 3};
        int soma = Soma(valores);
        int maior = Maior(valores);
        int pares = Pares(valores);
        System.out.println("Soma: " + soma + "\nMaior: " + maior + "\nPares: " + pares);
    }
}