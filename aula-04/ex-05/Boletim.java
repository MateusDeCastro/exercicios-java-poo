import java.util.Scanner;

public class Boletim {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];
        double[][] notas = new double[3][3];

        // Leitura dos nomes e das notas
        for (int i = 0; i < 3; i++) {

            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();

            for (int j = 0; j < 3; j++) {

                System.out.print("Digite a nota " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();

            }

            sc.nextLine();
        }

        System.out.println("\n------------BOLETIM------------");
        System.out.println("----Aluno------------Média-----");
        System.out.println("-------------------------------");

        // Calcula e imprime as médias
        for (int i = 0; i < 3; i++) {

            double soma = 0;

            for (int j = 0; j < 3; j++) {
                soma += notas[i][j];
            }

            double media = soma / 3;

            System.out.printf("%-15s | %.2f%n", nomes[i], media);
        }

        sc.close();
    }
}

/*
 * O que foi mais chato:
 * Descobrir como fazer o alinhamento das linhas, pesquisei na internet e achei esse jeito com %-15s
 */
