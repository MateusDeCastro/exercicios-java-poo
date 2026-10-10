public class CofrePorcos {
    private static final int LIMITE_QUEBRA = 2000; 

    private int totalCentavos;
    private int moedas5;
    private int moedas10;
    private int moedas25;
    private int moedas50;
    private int moedas100;

    public boolean depositar(int centavos) {
        switch (centavos) {
            case 5:   moedas5++;   break;
            case 10:  moedas10++;  break;
            case 25:  moedas25++;  break;
            case 50:  moedas50++;  break;
            case 100: moedas100++; break;
            default:
                System.out.println("Moeda de " + centavos + " centavos rejeitada! "
                        + "Aceitas: 5, 10, 25, 50 e 100 centavos.");
                return false;
        }
        totalCentavos += centavos;
        return true;
    }

    public int getTotalCentavos() { return totalCentavos; }

    public String getTotalFormatado() {
        return String.format("R$ %d,%02d", totalCentavos / 100, totalCentavos % 100);
    }

    public int getQuantidade(int centavos) {
        switch (centavos) {
            case 5:   return moedas5;
            case 10:  return moedas10;
            case 25:  return moedas25;
            case 50:  return moedas50;
            case 100: return moedas100;
            default:  return 0;
        }
    }

    public int quebrar() {
        if (totalCentavos <= LIMITE_QUEBRA) {
            System.out.println("Não dá para quebrar: " + getTotalFormatado()
                    + " ainda não passa de R$ 20,00.");
            return 0;
        }
        int valor = totalCentavos;
        totalCentavos = 0;
        moedas5 = moedas10 = moedas25 = moedas50 = moedas100 = 0;
        System.out.println("Cofre quebrado!");
        return valor;
    }

    @Override
    public String toString() {
        return String.format("Cofre %s | 5c: %d, 10c: %d, 25c: %d, 50c: %d, R$1: %d",
                getTotalFormatado(), moedas5, moedas10, moedas25, moedas50, moedas100);
    }

    public static void main(String[] args) {
        CofrePorcos cofre = new CofrePorcos();
        cofre.depositar(5);
        cofre.depositar(10);
        cofre.depositar(25);
        cofre.depositar(50);
        cofre.depositar(100);
        cofre.depositar(3);    
        cofre.depositar(200);  
        System.out.println(cofre);

        cofre.quebrar();      

        for (int i = 0; i < 20; i++) cofre.depositar(100); 
        System.out.println(cofre);

        int valor = cofre.quebrar();
        System.out.printf("Valor devolvido: R$ %d,%02d%n", valor / 100, valor % 100);
        System.out.println(cofre);

        
        for (int i = 0; i < 20; i++) cofre.depositar(100);
        cofre.quebrar();
    }
}
