/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex7;

/**
 *
 * @author f.martins
 */
import java.util.Scanner;
public class Ex7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 1;
        while(n>0){
            System.out.println("Digite uma idade: ");
            int numero = input.nextInt();
            int idade1 = 0;
            int idade2 = 0;
            int idade3 = 0;
            int idade4 = 0;
            
            if(numero<=15){
                idade1++;
                System.out.println("A quantidade de pessoas com a idade menor que 15 anos é "+idade1);
           
                
            }
            if(numero>15 && numero<=40){
               idade2++;
               System.out.println("A quantidade de pessoas com a idade entre 16 e 40 anos é "+idade2);
            }
            if(numero>40 && numero<=60){
               idade3++;
               System.out.println("A quantidade de pessoas com a idade entre 41 e 60 anos é "+idade3); 
            }
            if(numero>60){
               idade4++;
               System.out.println("A quantidade de pessoas com a idade maior que 60 anos é "+idade4); 
            }
            int maiorIdade = 0;
            
            if(maiorIdadea < numero ){
            
            }
                    
                    
                
        }
        
    }
}
