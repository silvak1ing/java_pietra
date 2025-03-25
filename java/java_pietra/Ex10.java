/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


/**
 *
 * @author Gabriel
 */
import java.util.Scanner;
public class Ex10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        int n1 = input.nextInt();
        System.out.println("Digite a segunda nota: ");
        int n2 = input.nextInt();
        System.out.println("Digite a terceira nota: ");
        int n3 = input.nextInt();
        System.out.println("Digite a média de exercício: ");
        int me = input.nextInt();
        
        double ma = (n1+n2*2+n3*3+me)/7;
        
        if (ma >= 90){
        System.out.print("A nota do aluno foi A, ele está APROVADO!");
        }
        if (ma >= 75 && ma < 90){
        System.out.print("A nota do aluno foi B, ele está APROVADO!");
        }
        if (ma >= 60 && ma < 75){
        System.out.print("A nota do aluno foi C, ele está APROVADO!");
        }
        if (ma >= 40 && ma < 60){
        System.out.print("A nota do aluno foi D, ele está REPROVADO!");
        }
        if (ma < 40){
        System.out.print("A nota do aluno foi E, ele está REPROVADO!");
        }
    }
}
