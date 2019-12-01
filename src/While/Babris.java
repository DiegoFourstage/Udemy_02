
package While;

import java.util.Scanner;


public class Babris {
    
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        
       int codigo, caneta = 0, lapis = 0, borracha = 0; 
       
       System.out.println("Digite o código do PRODUTO: \n1 - Caneta\n2 - Lapis\n3 - borracha\n");
       
       codigo = sc.nextInt();
       
       while (codigo != 4){
           if(codigo == 1){
               caneta = caneta + 1;
               System.out.println("Caneta adicionado mais: " + caneta);
           } else if (codigo == 2){
               lapis = lapis + 1;
               System.out.println("Lapis adicionado mais: " + lapis);
           } else if (codigo == 3){
               borracha = borracha + 1;
               System.out.println("Borracha adcionado mais: " + borracha);
               
               
           } 
               
               codigo = sc.nextInt();
              
           
       }
       System.out.println("Caneta: " + caneta);
       System.out.println("Lapis: " + lapis);
       System.out.println("Borracha: " + borracha);
    }
    
}
