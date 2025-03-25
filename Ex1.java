/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


/**
 *
 * @author Gabriel
 */
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
       
        

    Scanner input = new Scanner(System.in);

    System.out.println("Digite um numero: ");
    int numero = input.nextInt();

    int fatorial = 1;
    for(int i = 1;i <= numero;i++){

    fatorial =   fatorial*i;

    }

    System.out.println("O fatorial do número "+numero+" é igual a "+fatorial);
 
    input.close();
    }
}
