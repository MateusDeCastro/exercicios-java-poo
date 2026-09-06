import  java.util.Scanner;

public class Menu{
    public static double soma(double[] historico){
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o primeiro número: ");
            int num1 = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int num2 = sc.nextInt();
            return num1 + num2;
        }
    public static void histo(double[] historico, int quantidade){
        for(int i = 0; i < quantidade; i++){
             System.out.printf("%d = %.2f\n", i + 1, historico[i]);
        }
    }
    public static void main(String[] args){
        double[] historico = new double[10];
        Scanner sc = new Scanner(System.in);
        int quantidade = 0;
        int opcao = 0;
        do{
            System.out.println("-----Menu-----");
            System.out.println("1 --> Soma");
            System.out.println("2 --> Ver histórico");
            System.out.println("0 --> Sair");
            System.out.println("Digite sua opção: ");
            opcao = sc.nextInt();

            if(opcao == 1){
                double resultado = soma(historico);
                historico[quantidade] = resultado;
                quantidade++;
                System.out.printf("Resultado: %.2f\n", resultado);
            }
            else if(opcao == 2){
                histo(historico, quantidade);
            }
        }while(opcao != 0);
        System.out.println("Programa encerrado");
    }
}