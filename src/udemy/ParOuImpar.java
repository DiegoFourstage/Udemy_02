
package udemy;

import java.util.Scanner;

public class ParOuImpar {
    
    public static void main (String [] aregs){
        
        Scanner sc = new Scanner(System.in);
        
        int inteiro, porcento;
        
        System.out.println("Digite um numero inteiro: ");
        inteiro = sc.nextInt();
        
        if(inteiro % 2 == 0){
            porcento = inteiro % 2;
            System.out.printf("Numero digitado: %d, á sobra é: %d, é um numero par%n" , inteiro, porcento);
        }else{
            porcento = inteiro % 2;
            System.out.printf("Numero digitado: %d, á sobra é: %d, é um numero IMPAR. ", inteiro, porcento);
        }
        
    }
    
}
