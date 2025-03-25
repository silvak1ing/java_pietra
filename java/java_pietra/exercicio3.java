import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[7];
        int soma = 0;
        System .out.println("Digite 7 números: ");
        for (int i = 0; i < 7; i++) {
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
    }
    double media = (double) soma /7;
    System.out.println("A média dos números é: " + media);
    scanner.close();
}
}