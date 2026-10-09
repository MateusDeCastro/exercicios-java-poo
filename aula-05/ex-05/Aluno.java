public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }

    public String getNome() {
        return nome;
    }

    public void exibirBoletim() {
        double media = calcularMedia();
        System.out.printf("Aluno: %s | Nota 1: %.1f | Nota 2: %.1f | Média: %.1f | Situação: %s%n",
                nome, nota1, nota2, media, media >= 6.0 ? "Aprovado" : "Reprovado");
    }
}
