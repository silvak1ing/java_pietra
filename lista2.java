import java.util.Scanner;

// Superclasse
class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}

// Subclasse Carro
class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo);
        this.quantidadePortas = quantidadePortas;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Quantidade de Portas: " + quantidadePortas);
    }
}

// Subclasse Moto
class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Cilindradas: " + cilindradas);
    }
}

// Classe principal
public class lista2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja cadastrar um Carro ou uma Moto? (carro/moto)");
        String tipo = scanner.nextLine().toLowerCase();

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        if (tipo.equals("carro")) {
            System.out.print("Quantidade de portas: ");
            int portas = scanner.nextInt();
            Carro carro = new Carro(marca, modelo, portas);
            System.out.println("\nInformacoes do Carro:");
            carro.exibirInformacoes();
        } else if (tipo.equals("moto")) {
            System.out.print("Cilindradas: ");
            int cilindradas = scanner.nextInt();
            Moto moto = new Moto(marca, modelo, cilindradas);
            System.out.println("\nInformacoes da Moto:");
            moto.exibirInformacoes();
        } else {
            System.out.println("Tipo de veiculo inválido.");
        }

        scanner.close();
    }
}

