/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author Gabriel
 */
import java.util.Scanner;
public class Ex11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite seu peso: ");
        double peso = input.nextDouble();
        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();
        
        double imc = peso/(altura/2);
        
        if(imc < 18.5){
            System.out.println("Abaixo do peso!");          
        }
        if(imc >= 18.5 && imc < 25){
            System.out.println("Peso normal!");          
        }
        if(imc >= 25 && imc < 30){
            System.out.println("Acima do peso!");          
        }
        if(imc >= 30 ){
            System.out.println("Obeso!");          
        }
        
        
    }
}
