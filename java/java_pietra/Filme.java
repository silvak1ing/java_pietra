public class Filme {
    private String titulo;
    private double notaTotal;
    private int quantidadeAvaliacoes;
    public Filme(String titulo) {
        this.titulo = titulo;
        this.notaTotal = 0.0;
        this.quantidadeAvaliacoes = 0;
    }
    public void avaliar(double nota) {
        notaTotal += nota;
        quantidadeAvaliacoes++;
        System.out.println("Avaliacao adicionada: " + nota);
    }
    public double calcularMedia() {
        if (quantidadeAvaliacoes == 0) {
            return 0.0;
        }
        return notaTotal / quantidadeAvaliacoes;
    }
    public static void main(String[] args) {
        Filme filme = new Filme("O Poderoso Chefão");
        filme.avaliar(9.0);
        filme.avaliar(8.5);
        System.out.println("Media das avaliações: " + filme.calcularMedia());
    }
}
