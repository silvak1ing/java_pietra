/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex3;

/**
 *
 * @author Gabriel
 */
import java.util.Scanner;
public class Ex3 {

    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Digite um numero: ");
    int numero = input.nextInt(); 

    int somadiv=0;
    
    for(int i = 1; i <= (numero/2); i++){
    if (numero % i == 0){
    somadiv= somadiv + i;
}
}
   
    if(somadiv == numero){
    System.out.println("Este número é perfeito");
    }else{ 
    System.out.println("Este número não é perfeito");

}

    input.close();
    }
}
