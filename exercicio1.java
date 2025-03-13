import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int contadorpares =0;
        System.out.println("Digite um numero:");
        for (int i =0; i < 10;i++){
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 ==0){
                contadorpares++;
            }
        }
        System.out.println("quantidade de numeros pares "+contadorpares);
        scanner.close();
    }
}