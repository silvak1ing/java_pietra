import java.util.Scanner;

// Classe base
class Empregado {
    protected String nome;
    protected double salarioBase;

    public Empregado(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }
}

// Gerente
class Gerente extends Empregado {
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    public double calcularSalario() {
        return salarioBase + bonus;
    }
}

// Desenvolvedor
class Desenvolvedor extends Empregado {
    private int horasExtras;
    private static final double VALOR_HORA_EXTRA = 50.0;

    public Desenvolvedor(String nome, double salarioBase, int horasExtras) {
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
    }

    public double calcularSalario() {
        return salarioBase + (horasExtras * VALOR_HORA_EXTRA);
    }
}

// Programa principal
public class lista5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o cargo do funcionario? (gerente/desenvolvedor)");
        String tipo = scanner.nextLine().toLowerCase();

        System.out.print("Nome do funcionario: ");
        String nome = scanner.nextLine();

        System.out.print("Salario base: R$ ");
        double salarioBase = scanner.nextDouble();

        Empregado empregado;

        if (tipo.equals("gerente")) {
            System.out.print("Bônus fixo: R$ ");
            double bonus = scanner.nextDouble();
            empregado = new Gerente(nome, salarioBase, bonus);
        } else if (tipo.equals("desenvolvedor")) {
            System.out.print("Horas extras trabalhadas: ");
            int horasExtras = scanner.nextInt();
            empregado = new Desenvolvedor(nome, salarioBase, horasExtras);
        } else {
            System.out.println("Cargo inválido!");
            scanner.close();
            return;
        }

        double salarioFinal = empregado.calcularSalario();
        System.out.println("\nSalario final de " + nome + ": R$ " + salarioFinal);

        scanner.close();
    }
}
