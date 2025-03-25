/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author Gabriel
 */
import java.util.Scanner;
public class Ex4 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double soma = 0;
    double maiorIdade=0;
    double media = 0;
    for(int i = 1; i <= 20;i++){
    
    
    
    System.out.println("Digite sua idade: ");
    double idade = input.nextInt();
    
    if(idade > 18){
    maiorIdade = maiorIdade +1;
    }
    
    System.out.println("Digite seu nome: ");
    String nome;
    nome = input.nextLine();
    
    soma = soma + idade;
    media = soma/20;
    
    
  
    }
    
    System.out.println("A soma das idade é:  /n"+soma+"A média das idades é: "+media+"A quantida de pessoas maiores de idade é: /n"+maiorIdade);
    
    

    input.close();
    }
}
