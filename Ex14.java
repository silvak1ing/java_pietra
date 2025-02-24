/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex14;

/**
 *
 * @author Gabriel
 */
import java.util.Scanner;
public class Ex14 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = input.nextInt();
        System.out.println("Digite outro número");
        int n2 = input.nextInt();
        
        if (n1 > n2) {
            
            System.out.println("O maior número é: " + n1);
            System.out.println("O menor número é: " + n2);
            
        } else if (n2 > n1) {
            
            System.out.println("O maior número é: " + n2);            
            System.out.println("O menor número é: " + n1);
            
        } else {
            System.out.println("Os dois números são iguais.");
        }
    }
}
