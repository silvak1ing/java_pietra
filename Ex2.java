/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex2;

/**
 *
 * @author Gabriel
 */
import java.util.Scanner;
public class Ex2 {

    public static void main(String[] args) {
        

    Scanner input = new Scanner(System.in);

    System.out.println("Digite um numero: ");
    int numero = input.nextInt(); 

    int soma = 0;
    for(int i = 1;i <= numero; i++){
    if (numero%2!=0){
    soma = soma+ numero;
}
}
    System.out.println("A soma dos números ímpares de 1 até "+numero+" é igual a "+soma);

    input.close ();
        
        
    }
}
