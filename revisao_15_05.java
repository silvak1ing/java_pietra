import java.util.Scanner;
public class revisao_15_05 {
    private String nome;
    private double media;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        revisao_15_05[] estudante = new revisao_15_05[3];

        for (int i = 0; i < estudante.length; i++) {
            estudante[i] = new revisao_15_05();
            System.out.print("Informe o nome do aluno " + (i + 1) + ": ");
            estudante[i].setNome(scanner.nextLine());
            System.out.print("Informe a média do aluno " + (i + 1) + ": ");
            estudante[i].setMedia(scanner.nextDouble());
            scanner.nextLine(); 
        }
        System.out.println("\nLista de Estudantes:");
        for (int i = 0; i < estudante.length; i++) {
            System.out.println("Estudante " + (i + 1) + ": " + estudante[i].getNome() +" - Média: " + estudante[i].getMedia());
        }
        scanner.close();
    }
}
