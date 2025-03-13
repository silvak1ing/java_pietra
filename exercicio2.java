import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        System.out.println("Digite um numero: ");
        for (int i=0; i<6;i++){
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Numeros na ordem inversa");
        for (int i=5; i>=0; i--){
            System.out.println(numeros[i]+" ");
        }
    }
}