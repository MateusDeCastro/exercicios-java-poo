public class Turma {
    public static void main(String[] args) {
        Aluno[] alunos = {
            new Aluno("Mariana", 8.5, 7.0),
            new Aluno("Pedro", 5.0, 6.0),
            new Aluno("João", 4.5, 3.0)
        };

        for (Aluno aluno : alunos) {
            aluno.exibirBoletim();
        }
    }

    /*
     * Comparação de linhas:
     * - A versão de agora ficou bem mais compacto e sem repetição, ficando bem mais facil de entender
     *
     * O que ficou mais fácil de mudar:
     * - Para adicionar um aluno, basta criar outro objeto no array.
     * - Todas as funções estão em um só lugar e não preciso repetir
     */
}
