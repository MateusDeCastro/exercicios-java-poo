public class Turma {
    public static void main(String[] args) {
        System.out.println("Matriculados no início: " + Aluno.getTotalAlunos()); // 0

        Aluno a1 = new Aluno("Bruno", 8.0, 9.0);
        System.out.println("Após Bruno: " + Aluno.getTotalAlunos());              // 1

        Aluno a2 = new Aluno("Carla", 6.0, 5.0);
        Aluno a3 = new Aluno("Diego", 2.0, 4.0);
        System.out.println("Após Carla e Diego: " + Aluno.getTotalAlunos());      // 3

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("\n--- Validação do setter ---");
        a1.setNota1(11);   
        a1.setNota2(-0.5);
        a1.setNota1(10);
        System.out.println("Nota aceita: " + a1);

        System.out.println("\n--- Construtor com nota inválida não conta ---");
        new Aluno("Fantasma", 15, 5);
        System.out.println("Total final: " + Aluno.getTotalAlunos());             // 3
    }
}
