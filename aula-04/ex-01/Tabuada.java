import java.util.Scanner;

public class Tabuada{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = sc.nextDouble();
        System.out.println("-------Com prinft-------");
        System.out.printf("%.2f * 1 = %.2f", num, num * 1);
        System.out.printf("\n%.2f * 2 = %.2f", num, num * 2);
        System.out.printf("\n%.2f * 3 = %.2f", num, num * 3);
        System.out.printf("\n%.2f * 4 = %.2f", num, num * 4);
        System.out.printf("\n%.2f * 5 = %.2f", num, num * 5);
        System.out.printf("\n%.2f * 6 = %.2f", num, num * 6);
        System.out.printf("\n%.2f * 7 = %.2f", num, num * 7);
        System.out.printf("\n%.2f * 8 = %.2f", num, num * 8);
        System.out.printf("\n%.2f * 9 = %.2f", num, num * 9);
        System.out.printf("\n%.2f * 10 = %.2f", num, num * 10);
        System.out.println("\n-------Com For-------");
        for(int i = 1; i <= 10; i++){
            System.out.printf("%.2f * %d = %.2f\n", num, i, num * i);
        }
    }
}