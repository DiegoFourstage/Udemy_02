/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de 
cada peça 1, ocódigo de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
Calcule e mostre o valor a ser pago.
*/

package udemy;

import java.util.Locale;
import java.util.Scanner;

public class ValorDePeca {
    
    public static void main(String [] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int caneta , lapis , quantidadeCaneta, quantidadeLapis;
        double valorCaneta,valorLapis,totalCaneta, totalLapis,totalTodos;
        
        System.out.println("Codigo da peça ");
        caneta = sc.nextInt();
        
        System.out.println("Digite quantidade de peças: ");
        quantidadeCaneta = sc.nextInt();
        
        System.out.println("Valor unitario: ");
        valorCaneta = sc.nextDouble();
        
        System.out.println("================================");
        
        System.out.println("Codigo da peça ");
        lapis = sc.nextInt();
        
        System.out.println("Digite quantidade de peças: ");
        quantidadeLapis = sc.nextInt();
        
        System.out.println("Valor unitario: ");
        valorLapis = sc.nextDouble();
        
        totalCaneta = valorCaneta*quantidadeCaneta;
        totalLapis = valorLapis*quantidadeLapis;
        totalTodos = totalCaneta+totalLapis;
        
        System.out.printf("Valor a pagar: %.2f ", totalTodos);
        
        
        
        
        
        
    }
    
}
