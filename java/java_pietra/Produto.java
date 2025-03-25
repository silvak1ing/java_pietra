public class Produto {
    private String nome;
    private double preco;
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public void aplicarDesconto(double percentual) {
        double desconto = preco * (percentual / 100);
        preco -= desconto;
    }

    public double getPreco() {
        return preco;
    }
    public static void main(String[] args) {
        Produto produto = new Produto("Produto Exemplo", 100.0);
        System.out.println("Preço original: " + produto.getPreco());
        
        produto.aplicarDesconto(15);
        System.out.println("Preço após desconto: " + produto.getPreco());
    }
}
