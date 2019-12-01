
package While;

import java.util.Scanner;

public class Senha {
    
    public static void main (String [] args){
        
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Digite sua SENHA: ");
    int senha = sc.nextInt();
    
    while(senha != 2002){
        System.out.println("Senha Invalida");
        senha = sc.nextInt();
    } 
      
    System.out.println("Acesso Permitido");
        
    }
    
    
}
