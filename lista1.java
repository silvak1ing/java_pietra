import java.util.Scanner;

public class lista1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();

        sc.nextLine(); // consumir a quebra de linha

        System.out.print("A pessoa é aluno ou funcionário? (a/f): ");
        String tipo = sc.nextLine();

        Pessoa pessoa;

        if (tipo.equalsIgnoreCase("f")) {
            System.out.print("Digite o salário: ");
            double salario = sc.nextDouble();
            pessoa = new Funcionario(nome, idade, salario);
        } else if (tipo.equalsIgnoreCase("a")) {
            System.out.print("Digite a nota: ");
            double nota = sc.nextDouble();
            pessoa = new Aluno(nome, idade, nota);
        } else {
            System.out.println("Tipo inválido. Encerrando.");
            sc.close();
            return;
        }

        System.out.println("\n--- DADOS DA PESSOA ---");
        pessoa.mostrarDados();

        sc.close();
    }
}

// Superclasse
class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

// Subclasse Funcionario
class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Salário: R$ " + salario);
    }
}

// Subclasse Aluno
class Aluno extends Pessoa {
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Nota: " + nota);
    }
}
