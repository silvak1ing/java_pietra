
import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        funcionarios.add(new Funcionario("Ana", "Analista", 4500));
        funcionarios.add(new Funcionario("Bruno", "Desenvolvedor", 5500));
        funcionarios.add(new Funcionario("Carla", "Gerente", 7000));

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha
            switch (opcao) {
                case 1 -> cadastrarFuncionario();
                case 2 -> listarFuncionarios();
                case 3 -> alterarCargo();
                case 4 -> aumentarSalario();
                case 5 -> desativarFuncionario();
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("\n1 - Cadastrar funcionário");
        System.out.println("2 - Listar funcionários");
        System.out.println("3 - Alterar cargo");
        System.out.println("4 - Aumentar salário");
        System.out.println("5 - Desativar funcionário");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarFuncionario() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        funcionarios.add(new Funcionario(nome, cargo, salario));
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    private static void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }
        for (Funcionario f : funcionarios) {
            f.exibirDados();
        }
    }

    private static void alterarCargo() {
        Funcionario f = buscarFuncionarioPorNome();
        if (f != null) {
            System.out.print("Novo cargo: ");
            String novoCargo = scanner.nextLine();
            f.setCargo(novoCargo);
            System.out.println("Cargo atualizado com sucesso!");
        }
    }

    private static void aumentarSalario() {
        Funcionario f = buscarFuncionarioPorNome();
        if (f != null) {
            System.out.print("Percentual de aumento: ");
            double percentual = scanner.nextDouble();
            f.aumentarSalario(percentual);
            System.out.println("Salário atualizado com sucesso!");
        }
    }

    private static void desativarFuncionario() {
        Funcionario f = buscarFuncionarioPorNome();
        if (f != null) {
            f.desativar();
            System.out.println("Funcionário desativado com sucesso!");
        }
    }

    private static Funcionario buscarFuncionarioPorNome() {
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        for (Funcionario f : funcionarios) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                return f;
            }
        }
        System.out.println("Funcionário não encontrado.");
        return null;
    }
}
