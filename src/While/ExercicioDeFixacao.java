
package While;

import java.util.Scanner;


public class ExercicioDeFixacao {
    
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite um numero inteiro, se não,\nprograma ira repetir,\naté for numero inteiro: ");
        int numero = sc.nextInt();
        int valor1,valor2,valor3,valor4;
        
        while (numero <= 0){
            System.out.println("Digite novamente: ");
            numero = sc.nextInt();
        } 
        System.out.println("Digite valor1: ");
        valor1 = sc.nextInt();
        System.out.println("Digite valor2: ");
        valor2 = sc.nextInt();
        System.out.println("Digite valor3: ");
        valor3 = sc.nextInt();
        System.out.println("Digite valor4: ");
        valor4 = sc.nextInt();
        
        if(numero > valor2 || valor1 > valor3){
       
    }else if (valor2 > valor1 || valor2 > valor3){
        
    }
       System.out.println("Valor #1: " + valor1);
       System.out.println("Valor #2: " + valor2);
       System.out.println("Valor #3: " + valor3);
       System.out.println("Valor #4: " + valor4);
    }
    
}
