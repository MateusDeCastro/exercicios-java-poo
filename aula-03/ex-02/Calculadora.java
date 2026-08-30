import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        System.out.print("Digite um operador (+, -, * ou /): ");
        char operador = sc.next().charAt(0);

        double result = 0;

        switch(operador){
            case '+':
                result = num1 + num2;
                System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, result);
                break;
            case '/':
                result = num1 / num2;
                System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, result);
                break;
            default:
                System.out.println("Operador invalido");
                break;
        }   
    }
}