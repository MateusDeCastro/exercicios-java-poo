public class Aluno {
    private static int totalAlunos = 0;

    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        setNota1(nota1);
        setNota2(nota2);
        totalAlunos++; 
    }

    public static int getTotalAlunos() { return totalAlunos; }

    public String getNome()  { return nome; }
    public double getNota1() { return nota1; }
    public double getNota2() { return nota2; }

    public void setNota1(double nota) { this.nota1 = validar(nota); }
    public void setNota2(double nota) { this.nota2 = validar(nota); }

    private double validar(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida: " + nota + " (use valores entre 0 e 10).");
        }
        return nota;
    }

    public double getMedia() { return (nota1 + nota2) / 2.0; }

    public String getSituacao() {
        double m = getMedia();
        if (m >= 7) return "Aprovado";
        if (m >= 5) return "Recuperação";
        return "Reprovado";
    }

    @Override
    public String toString() {
        return String.format("%s | média: %.1f | %s", nome, getMedia(), getSituacao());
    }
}
