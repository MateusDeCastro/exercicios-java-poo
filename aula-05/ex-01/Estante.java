public class Estante {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 256);
        Livro livro2 = new Livro("O Hobbit", "J. R. R. Tolkien", 310);
        Livro livro3 = new Livro("A Hora da Estrela", "Clarice Lispector", 88);

        livro2.emprestar();

        livro1.exibirFicha();
        livro2.exibirFicha();
        livro3.exibirFicha();
    }
}
