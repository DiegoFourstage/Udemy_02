/*
Exercicio de número 2 pdf extrutura sequencial
*/
package udemy;

import java.util.Locale;
import java.util.Scanner;

public class AreaDoRaio {
    
    public static void main(String [] args){
        
        Locale.setDefault(Locale.US); // Unicode em Estados Unidos, usa se ponto em vez de virgula
        Scanner sc = new Scanner(System.in);
        
        System.out.println("");
        double areaRaio = 3.14159; //Valor do raio do circulo
        
        System.out.println("Digite a sua entrada de numero: "); 
        double areaCirculo = sc.nextDouble();
        
        double saida = areaRaio * areaCirculo * areaCirculo;
        
        System.out.printf("O valor do circulo é: %.4f%n", saida);
        
        
        
    }
    
}
