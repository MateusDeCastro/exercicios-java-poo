import java.util.Scanner;

public class IMC{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite o seu peso: ");
        double peso = sc.nextDouble();
        System.out.printf("Digite a sua altura: ");
        double altura = sc.nextDouble();
        sc.nextLine(); //Nescessario pois o nextDouble lê o numero e deixa o Enter, sendo nescessario consumir com o nextLine

        double imc = peso / (altura * altura);

        System.out.printf("%s, seu IMC é %.2f", nome, imc);
    }
}