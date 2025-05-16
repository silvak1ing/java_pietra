import java.util.Scanner;
public class Ex12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int n1 = input.nextInt();
        System.out.println("Digite um número: ");
        int n2 = input.nextInt();
        
        int diferenca;
        diferenca = n1-n2;
        
        System.out.println("A diferença entre os números "+n1+" e "+n2+" é "+diferenca);
        
    }
}
