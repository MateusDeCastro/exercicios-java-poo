import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        System.out.printf("\nSoma: %.2f", num1 + num2);
        System.out.printf("\nSubtração: %.2f", num1 - num2);
        System.out.printf("\nMultiplicação: %.2f", num1 * num2);
        System.out.printf("\nDivisão: %.2f", num1 / num2);
        System.out.printf("\nResto: %.2f", num1 % num2);
    }
}