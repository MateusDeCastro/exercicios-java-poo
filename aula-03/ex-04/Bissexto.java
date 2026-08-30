import java.util.Scanner;

public class Bissexto{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.printf("%d é um ano bissexto", ano);
        }
        else{
            System.out.printf("%d não é um ano bissexto", ano);
        }
    }
}