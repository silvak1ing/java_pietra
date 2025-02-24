/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex9;

/**
 *
 * @author Gabriel
 */
import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        
        double leiteCondensado = 5.19;
        double cremedeLeite = 2.39;
        double arroz = 22.50;
        int opcao = 0;
        double valorCompra = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Leite condensado\n2 - Creme de leite\n3 - Arroz 5kg\n4 - Finalizar Compra!");
        while(opcao != 4){
            
        System.out.println("Selecione os produtas que irá levar:");
        opcao = input.nextInt();
        if(opcao == 1){
            valorCompra += leiteCondensado;           
        }
        if(opcao == 2){
            valorCompra += cremedeLeite;           
        }
        if(opcao == 3){
            valorCompra += arroz;           
        }
        }
        int opcaoPagamento;
        double desconto;
        double juros;
        double valorDesconto;
        double valorJuros;
        System.out.println("Valor da compra: R$"+valorCompra+"\nEscolha uma opção de pagamento:\n1 - Á vista em dinheiro ou cheque\n2 - Á vista no cartão de crédito\n3 - Em duas vezes\n4 - Em três vezes "); 
        opcaoPagamento = input.nextInt();
        if(opcaoPagamento == 1){
           valorDesconto = valorCompra * 0.1;
           valorCompra -= valorDesconto;
           System.out.println("O valor da compra com desconto de 10%: R$"+valorCompra);          
        }
        if(opcaoPagamento == 2){
           valorDesconto = valorCompra * 0.15;
           valorCompra -= valorDesconto;
           System.out.println("O valor da compra com desconto de 15%: R$"+valorCompra);
        }
        if(opcaoPagamento == 3){
           valorCompra /= 2;
           
           System.out.println("O valor da em duas vezes: R$"+valorCompra);
        }
        if(opcaoPagamento == 4){
           valorJuros = valorCompra * 0.1;
           valorCompra += valorJuros;
           valorCompra /= 3;
           System.out.println("O valor da compra em três vezes mais juros de 10%: R$"+valorCompra);
        }
        
    
    
    
    
    
    }
}
