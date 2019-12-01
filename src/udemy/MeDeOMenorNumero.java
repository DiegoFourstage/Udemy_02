/*
https://www.youtube.com/watch?v=UjCVIcKccdQ

*/
package udemy;

import java.util.Scanner;

public class MeDeOMenorNumero {
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        int numero1, numero2, numero3;
        
        
        System.out.println("Me de o menor numero de três variavel inteiras: ");
        
        System.out.println("Digite o primeiro numero: ");
        numero1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        numero2 = sc.nextInt();
        System.out.println("Digite o terceiro numero: ");
        numero3 = sc.nextInt();
        
        if(numero1 < numero2 && numero1 < numero3){
            System.out.println("Numero menor numero1 = " + numero1);
        } else if (numero2 < numero3) {
            System.out.println("Menor numero2 = " + numero2);
            
        } else{
            System.out.println("Menor numero3 = " + numero3);
        } 
            
    }
    
}
