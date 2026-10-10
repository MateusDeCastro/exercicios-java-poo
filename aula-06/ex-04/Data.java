public class Data {
    private static final int ANO_ATUAL = 2026;

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            System.out.println("Mês inválido: " + mes + " (use 1 a 12).");
        }
        if (dia < 1 || dia > diasNoMes(mes, ano)) {
            System.out.println("Dia inválido: " + dia + " para o mês " + mes + "/" + ano + ".");
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(int dia, int mes) {
        this(dia, mes, ANO_ATUAL);
    }

    public Data() {
        this(1, 1, ANO_ATUAL);
    }

    private static boolean bissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
    }

    private static int diasNoMes(int mes, int ano) {
        switch (mes) {
            case 2:  return bissexto(ano) ? 29 : 28;
            case 4: case 6: case 9: case 11: return 30;
            default: return 31;
        }
    }

    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAno() { return ano; }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public static void main(String[] args) {
        System.out.println(new Data(25, 12, 2030)); 
        System.out.println(new Data(15, 8));      
        System.out.println(new Data());           
        System.out.println(new Data(29, 2, 2028));  

        int[][] invalidas = { {10, 13, 2026}, {10, 0, 2026}, {31, 4, 2026}, {29, 2, 2027} };
        for (int[] d : invalidas) {
            new Data(d[0], d[1], d[2]);
        }
    }
}
