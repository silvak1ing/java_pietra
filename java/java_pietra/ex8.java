/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author Gabriel
 */
import java.util.Scanner;
public class ex8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero = 2;
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
         
                
        while(numero > 0 ){
        System.out.println("Digite um número: ");
        numero = input.nextInt();
        if (numero<25){
            n1 = n1 + 1;        
        }
        if (numero>25 && numero<=50){
            n2 = n2 + 1;        
        }
        if (numero>50 && numero<=75){
            n3 = n3 + 1;        
        }
        if (numero>75 && numero<=100){
            n4 = n4 + 1;        
        }
        
        
        System.out.println("Números menor que 25: "+n1+"\nNúmeros entre 26 e 50: "+n2+"\nNúmero entre 51 e 75: "+n3+"\nNúmeros entre 76 e 100: ");
        
        
        }
        
        
        
        
        
    }
}
