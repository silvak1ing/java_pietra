import java.util.Scanner;

// Classe base
class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void mostrarDetalhes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preco: R$ " + preco);
    }
}

// Subclasse Livro
class Livro extends Produto {
    private String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Autor: " + autor);
    }
}

// Subclasse Eletronico
class Eletronico extends Produto {
    private String marca;

    public Eletronico(String nome, double preco, String marca) {
        super(nome, preco);
        this.marca = marca;
    }

    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Marca: " + marca);
    }
}

// Programa principal
public class lista6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você quer cadastrar um livro ou um eletrônico?");
        String tipo = scanner.nextLine().toLowerCase();

        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Preco: R$ ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer

        Produto produto;

        if (tipo.equals("livro")) {
            System.out.print("Autor do livro: ");
            String autor = scanner.nextLine();
            produto = new Livro(nome, preco, autor);
        } else if (tipo.equals("eletronico")) {
            System.out.print("Marca do eletrônico: ");
            String marca = scanner.nextLine();
            produto = new Eletronico(nome, preco, marca);
        } else {
            System.out.println("Tipo invalido de produto.");
            scanner.close();
            return;
        }

        System.out.println("\n📋 Detalhes do produto:");
        produto.mostrarDetalhes();

        scanner.close();
    }
}
