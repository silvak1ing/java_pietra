import java.util.Scanner;

// Superclasse
abstract class Forma {
    public abstract double calcularArea();
}

// Subclasse Retângulo
class Retangulo extends Forma {
    private double base, altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }
}

// Subclasse Círculo
class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

// Classe principal
public class lista8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Forma forma;

        System.out.println("Você quer calcular a area de um retangulo ou circulo?");
        String tipo = scanner.nextLine().toLowerCase();

        if (tipo.equals("retangulo")) {
            System.out.print("Informe a base: ");
            double base = scanner.nextDouble();
            System.out.print("Informe a altura: ");
            double altura = scanner.nextDouble();
            forma = new Retangulo(base, altura);
        } else if (tipo.equals("circulo")) {
            System.out.print("Informe o raio: ");
            double raio = scanner.nextDouble();
            forma = new Circulo(raio);
        } else {
            System.out.println("Forma invalida!");
            scanner.close();
            return;
        }

        System.out.printf("🧮 A area da forma escolhida é: %.2f\n", forma.calcularArea());
        scanner.close();
    }
}
