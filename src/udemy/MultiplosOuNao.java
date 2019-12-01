
package udemy;

import java.util.Scanner;

public class MultiplosOuNao {
    
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        int x, y;
        
        System.out.println("Digite o valor de X: ");
        x = sc.nextInt();
        System.out.println("Digite o valor de Y: ");
        y = sc.nextInt();
        
        
        if(x % y == 0 || y % x == 0){
            
            System.out.println("São Multiplos. ");
            
        }else {
            System.out.println("Infelizmente não são multiplos: ");
        }
        
        
    }
    
}
