/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author f.martins
 */
import java.util.Scanner;
public class Ex5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int na = 1;
        int nb = 1;
        int nc = 1;
        for(i = 1;i <=20;i++){
        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        
        if(numero<=100){
            na++;
            System.out.println(+na+" são menor que 100 ");
        }
        if(numero>100 && numero<=200){
            nb++;
            System.out.println(+nb+" estão entre 101 e 200 ");
        }
        if(numero>200){
            nc++;
            System.out.println(+nc+" são maior que 200 ");
        }
        
        }
        
    }
}
