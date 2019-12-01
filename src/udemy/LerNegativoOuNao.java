/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy;

import java.util.Scanner;

/**
 *
 * @author D1350
 */
public class LerNegativoOuNao {
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner (System.in);
        
        int numberInt;
        
        System.out.println("Me dê um numero inteiro: ");
        numberInt = sc.nextInt();
        
        if(numberInt < 0){
            System.out.println("Numero Negativo ");
            
        }else {
            System.out.println("Numero não negativo ");
            
        }
        
    }
    
}
