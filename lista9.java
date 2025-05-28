import java.util.Scanner;

// Classe base
class Transporte {
    protected int capacidade;

    public Transporte(int capacidade) {
        this.capacidade = capacidade;
    }

    public void mostrarInformacoes() {
        System.out.println("Capacidade: " + capacidade + " pessoas");
    }
}

// Subclasse Avião
class Aviao extends Transporte {
    private int altitudeMax;

    public Aviao(int capacidade, int altitudeMax) {
        super(capacidade);
        this.altitudeMax = altitudeMax;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Tipo: Avião");
        super.mostrarInformacoes();
        System.out.println("Altitude máxima: " + altitudeMax + " metros");
    }
}

// Subclasse Navio
class Navio extends Transporte {
    private int profundidadeMax;

    public Navio(int capacidade, int profundidadeMax) {
        super(capacidade);
        this.profundidadeMax = profundidadeMax;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Tipo: Navio");
        super.mostrarInformacoes();
        System.out.println("Profundidade máxima: " + profundidadeMax + " metros");
    }
}

// Classe principal
public class lista9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Transporte transporte;

        System.out.println("Você quer cadastrar um avião ou um navio?");
        String tipo = scanner.nextLine().toLowerCase();

        System.out.print("Capacidade de pessoas: ");
        int capacidade = scanner.nextInt();

        if (tipo.equals("aviao")) {
            System.out.print("Altitude máxima (em metros): ");
            int altitude = scanner.nextInt();
            transporte = new Aviao(capacidade, altitude);
        } else if (tipo.equals("navio")) {
            System.out.print("Profundidade máxima (em metros): ");
            int profundidade = scanner.nextInt();
            transporte = new Navio(capacidade, profundidade);
        } else {
            System.out.println("Tipo de transporte inválido!");
            scanner.close();
            return;
        }

        System.out.println("\n🚍 Informações do transporte:");
        transporte.mostrarInformacoes();

        scanner.close();
    }
}
