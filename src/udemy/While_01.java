/*
Criar um programa aonde numero positivo retorna(while) e negativo feche o programa.

*/
package udemy;

import java.util.Scanner;


public class While_01 {
    
    public static void main (String [] args){
    
        Scanner sc = new Scanner(System.in);
    int numero;
    
    System.out.println("Digite um numero: ");    
    
    numero = sc.nextInt();
    while (numero >= 0.0){
        
        System.out.printf("È um numero positivo, irei voltar a pedir pra digitar: ", numero);
        System.out.println("Digite um numero: ");
        numero = sc.nextInt();
    }   
    System.out.println("Numero negativo, fechando programa ");
    }   
   
    
}
