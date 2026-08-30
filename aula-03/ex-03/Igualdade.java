import java.util.Scanner;

public class Igualdade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        System.out.println(palavra == "Java"); 
        //String é objeto e o == ele tenta validar se a palavra Java também é string
        System.out.println(palavra.equals("Java"));
        System.out.println(palavra.equalsIgnoreCase("Java"));
    }
}