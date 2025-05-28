import java.util.Scanner;

// Superclasse
class Conta {
    protected String numero;
    protected double saldo;

    public Conta(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito feito! Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Valor invalido pra depositar!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque feito! Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Nao da pra sacar isso ai, saldo insuficiente ou valor inválido.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo atual da conta " + numero + ": R$ " + saldo);
    }
}

// Conta Corrente
class ContaCorrente extends Conta {
    private double taxaOperacao;

    public ContaCorrente(String numero, double taxaOperacao) {
        super(numero);
        this.taxaOperacao = taxaOperacao;
    }

    public void sacar(double valor) {
        double total = valor + taxaOperacao;
        if (valor > 0 && total <= saldo) {
            saldo -= total;
            System.out.println("Saque com taxa de R$" + taxaOperacao + " realizado! Saldo: R$ " + saldo);
        } else {
            System.out.println("Saque negado! Verifica o saldo e a taxa.");
        }
    }
}

// Conta Poupança
class ContaPoupanca extends Conta {
    private double rendimentoMensal;

    public ContaPoupanca(String numero, double rendimentoMensal) {
        super(numero);
        this.rendimentoMensal = rendimentoMensal;
    }

    public void aplicarRendimento() {
        double ganho = saldo * rendimentoMensal / 100;
        saldo += ganho;
        System.out.println("Rendimento aplicado: R$ " + ganho + " | Novo saldo: R$ " + saldo);
    }
}

// Classe principal
public class lista4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vai querer abrir qual tipo de conta? (corrente/poupanca)");
        String tipo = scanner.nextLine().toLowerCase();

        System.out.print("Numero da conta: ");
        String numero = scanner.nextLine();

        Conta conta;

        if (tipo.equals("corrente")) {
            System.out.print("Digite a taxa de operação (R$): ");
            double taxa = scanner.nextDouble();
            conta = new ContaCorrente(numero, taxa);
        } else if (tipo.equals("poupanca")) {
            System.out.print("Digite o rendimento mensal (%): ");
            double rendimento = scanner.nextDouble();
            conta = new ContaPoupanca(numero, rendimento);
        } else {
            System.out.println("Tipo de conta invalido.");
            scanner.close();
            return;
        }

        System.out.print("Quanto deseja depositar agora? R$ ");
        double deposito = scanner.nextDouble();
        conta.depositar(deposito);

        System.out.print("Quanto deseja sacar? R$ ");
        double saque = scanner.nextDouble();
        conta.sacar(saque);

        if (conta instanceof ContaPoupanca) {
            ((ContaPoupanca) conta).aplicarRendimento();
        }

        conta.mostrarSaldo();

        scanner.close();
    }
}
