public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }
    public void emprestar() {
        emprestado = true;
        System.out.println("O livro '" + titulo + "' foi emprestado.");
    }
    public void devolver() {
        emprestado = false;
        System.out.println("O livro '" + titulo + "' foi devolvido.");
    }
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        livro.emprestar();
        livro.devolver();
    }
}
