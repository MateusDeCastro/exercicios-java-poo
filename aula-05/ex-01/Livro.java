public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private boolean disponivel;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro \"" + titulo + "\" emprestado com sucesso.");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está emprestado.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro \"" + titulo + "\" devolvido com sucesso.");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está disponível.");
        }
    }

    public void exibirFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
        System.out.println("------------------------------");
    }
}
