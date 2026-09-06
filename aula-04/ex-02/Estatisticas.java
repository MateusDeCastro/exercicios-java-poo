public class Estatisticas{
    public static double menor(double[] nota){
            double m = 999.99;
            for(int i = 0; i < nota.length; i++){
                if(nota[i] < m){
                    m = nota[i];
                }
            }
            return m;
        }

        public static double maior(double[] nota){
            double me = 0.00;
            for(int i = 0; i < nota.length; i++){
                if(nota[i] > me){
                    me = nota[i];
                }
            }
            return me;
        }

        public static double soma(double[] nota){
            double soma = 0.00;
            for(int i = 0; i < nota.length; i++){
                soma = soma + nota[i];
            }
            return soma;
        }

        public static double media(double[] nota){
            return soma(nota) / nota.length;
        }

    public static void main(String[] args){
        double[] notas = {8.5, 6.0, 9.5, 7.0, 4.5};
        System.out.printf("Maior nota: %.2f\n", maior(notas));
        System.out.printf("Menor nota: %.2f\n", menor(notas));
        System.out.printf("Soma das notas: %.2f\n", soma(notas));
        System.out.printf("Média das notas: %.2f", media(notas));
    }
}