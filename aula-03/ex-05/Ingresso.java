import java.util.Scanner;

public class Ingresso{
    public static void main(String[] args){

        final String Fmeia = "Você paga somente meia entrada";
        final String Fsemana = "Hoje é terça, 20% de desconto";
        final double INTEIRA = 40.0;
        double valor = INTEIRA;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Você é estudante (s / n)? ");
        char estudante = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("Digite o dia da semana (Domingo, Segunda, Terca, Quarta, Quinta, Sexta ou Sabado): ");
        String dia = sc.nextLine();

        boolean meia = false, semana = false;

        if(idade < 18 || idade >= 60 || estudante == 's'){
            meia = true;
            valor = INTEIRA / 2;
        }
        if(dia.equalsIgnoreCase("Terca")){
            semana = true;
            valor = valor * 0.80;
        }

        if(meia == true && semana == true){
            System.out.printf("%s e %s\nValor a ser pago: %.2f", Fmeia, Fsemana, valor);
        }
        else if(meia == true && semana == false){
            System.out.printf("%s\nValor a ser pago: %.2f", Fmeia, valor);
        }
        else if(meia == false && semana == true){
            System.out.printf("%s\nValor a ser pago: %.2f", Fsemana, valor);
        }
        else{
            System.out.printf("Sem nenhum desconto\nValor a ser pago: %.2f", valor);
        }
    }
}