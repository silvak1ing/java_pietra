import java.util.Scanner;

// Superclasse
class Ingresso {
    protected double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void imprimirValor() {
        System.out.println("Valor do ingresso: R$ " + valor);
    }
}

// Ingresso Normal
class IngressoNormal extends Ingresso {
    public IngressoNormal(double valor) {
        super(valor);
    }

    @Override
    public void imprimirValor() {
        System.out.println("Ingresso Normal");
        super.imprimirValor();
    }
}

// Ingresso VIP
class IngressoVIP extends Ingresso {
    private double adicional;

    public IngressoVIP(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    @Override
    public void imprimirValor() {
        System.out.println("Ingresso VIP");
        System.out.println("Valor do ingresso: R$ " + (valor + adicional));
    }
}

// Classe principal
public class lista7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual ingresso você quer? (normal/vip)");
        String tipo = scanner.nextLine().toLowerCase();

        System.out.print("Valor base do ingresso: R$ ");
        double valorBase = scanner.nextDouble();

        Ingresso ingresso;

        if (tipo.equals("vip")) {
            System.out.print("Valor adicional VIP: R$ ");
            double adicional = scanner.nextDouble();
            ingresso = new IngressoVIP(valorBase, adicional);
        } else if (tipo.equals("normal")) {
            ingresso = new IngressoNormal(valorBase);
        } else {
            System.out.println("Tipo de ingresso inválido!");
            scanner.close();
            return;
        }

        System.out.println("\n🧾 Detalhes do ingresso:");
        ingresso.imprimirValor();

        scanner.close();
    }
}
