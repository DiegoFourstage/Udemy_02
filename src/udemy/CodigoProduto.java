/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade 
deste item. A seguir, calcule e mostre o valor da conta a pagar.

*/
package udemy;

import java.util.Scanner;


public class CodigoProduto {
    
    public static void main (String [] args){
        
       // Locale.seDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int codigo,quantidade;
        
        //Produtos e seus codigos;
        int cachorro = 1;
        int xSalada = 2;
        int xBacon = 3;
        int torradaSimples = 4;
        int refrigerante = 5;
        
        //Valores dos produtos
        double valorCachorro = 4.00;
        double valorXSalada = 4.50;
        double valorXBacon = 5.00;
        double valorTorradaSimples = 2.00;
        double valorRefrigerante = 1.50;
        
        //Total
        double total ;
        
        System.out.printf("Qual produto deseja comprar:%nCachorro Quente código = %d%n X-Salada código = %d%n X-Bacon código = "
                + "%d%n Torrada Simples código =  %d%n Refrigerante código = %d%n", cachorro,xSalada,xBacon,torradaSimples,refrigerante);
       
        System.out.println("Digite o CODIGO do produto: ");
        codigo = sc.nextInt();
        
        
        
        System.out.println("Digite o QUANTIDADE do produto: ");
        quantidade = sc.nextInt();
        
        if(codigo == cachorro){
            total = quantidade * valorCachorro;
            System.out.println(total);
            
        } else if( codigo == xSalada) {
            total = quantidade * valorXSalada;
            System.out.println(total);
        } else if( codigo == xBacon) {
            total = quantidade * valorXBacon;
            System.out.println(total);
        } else if( codigo == torradaSimples) {
            total = quantidade * valorTorradaSimples;
            System.out.println(total);
        } else if( codigo == refrigerante) {
            total = quantidade * valorRefrigerante;
            System.out.println(total);
        } else {
            System.out.println("Não existe código ");
        }    
        
                
        
    }
    
}
