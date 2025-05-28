import java.util.Scanner;

// Classe base
class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerSom() {
        System.out.println("Esse bicho faz um som, mas nao sei qual.");
    }
}

// Cachorro
class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void fazerSom() {
        System.out.println(nome + " (cachorrinho) falou: AU AU!");
    }
}

// Gato
class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    public void fazerSom() {
        System.out.println(nome + " (gatinho) falou: MIAU!");
    }
}

// Programa principal
public class lista3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Eae Vai cadastrar um cachorro ou um gato?");
        String tipo = scanner.nextLine().toLowerCase();

        System.out.print("Qual o nome do seu bichinho? ");
        String nome = scanner.nextLine();

        System.out.print("Quantos aninhos ele tem? ");
        int idade = scanner.nextInt();

        Animal animal;

        if (tipo.equals("cachorro")) {
            animal = new Cachorro(nome, idade);
        } else if (tipo.equals("gato")) {
            animal = new Gato(nome, idade);
        } else {
            System.out.println("Ops! Tipo de bicho nao reconhecido.");
            scanner.close();
            return;
        }

        System.out.println("\nOlha o que ele falou:");
        animal.fazerSom();

        scanner.close();
    }
}
