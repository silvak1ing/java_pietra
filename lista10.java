import java.util.Scanner;

// Superclasse
class Funcionario {
    protected String nome;
    protected String departamento;

    public Funcionario(String nome, String departamento) {
        this.nome = nome;
        this.departamento = departamento;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
    }
}

// Subclasse Professor
class Professor extends Funcionario {
    private String disciplina;

    public Professor(String nome, String departamento, String disciplina) {
        super(nome, departamento);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados() {
        System.out.println("Cargo: Professor");
        super.exibirDados();
        System.out.println("Disciplina: " + disciplina);
    }
}

// Subclasse Técnico
class Tecnico extends Funcionario {
    private String funcao;

    public Tecnico(String nome, String departamento, String funcao) {
        super(nome, departamento);
        this.funcao = funcao;
    }

    @Override
    public void exibirDados() {
        System.out.println("Cargo: Tecnico");
        super.exibirDados();
        System.out.println("Função: " + funcao);
    }
}

// Programa principal
public class lista10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("O funcionario é professor ou tecnico?");
        String tipo = scanner.nextLine().toLowerCase();

        System.out.print("Nome do funcionario: ");
        String nome = scanner.nextLine();

        System.out.print("Departamento: ");
        String departamento = scanner.nextLine();

        Funcionario funcionario;

        if (tipo.equals("professor")) {
            System.out.print("Disciplina que leciona: ");
            String disciplina = scanner.nextLine();
            funcionario = new Professor(nome, departamento, disciplina);
        } else if (tipo.equals("tecnico")) {
            System.out.print("Função do técnico: ");
            String funcao = scanner.nextLine();
            funcionario = new Tecnico(nome, departamento, funcao);
        } else {
            System.out.println("Tipo inválido!");
            scanner.close();
            return;
        }

        System.out.println("\n📋 Dados do Funcionario:");
        funcionario.exibirDados();

        scanner.close();
    }
}
