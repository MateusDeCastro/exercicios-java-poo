public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);            // reaproveita a validação já no nascimento!
        this.estoque = 0;
    }

    public String getNome()  { return nome; }
    public double getPreco() { return preco; }
    public int getEstoque()  { return estoque; }

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("Preço inválido: " + preco + ". Mantido " + this.preco);
            return;                 // sai sem alterar nada
        }
        this.preco = preco;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade deve ser positiva.");
            return;
        }
        this.estoque += quantidade;
    }

    public boolean vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade deve ser positiva.");
            return false;
        }
        if (quantidade > estoque) {
            System.out.println("Estoque insuficiente. Disponível: " + estoque);
            return false;
        }
        this.estoque -= quantidade;
        return true;
    }

    @Override
    public String toString() {
        return String.format("%s | R$ %.2f | estoque: %d", nome, preco, estoque);
    }
}