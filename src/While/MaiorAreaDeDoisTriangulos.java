
package While;

import java.util.Locale;
import java.util.Scanner;

public class MaiorAreaDeDoisTriangulos {
    
    public static void main (String [] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double xA, xB, xC, yA, yB, yC;
        
        System.out.println("Digite a medida do X do triangulo: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("====================================");
        
        System.out.println("Digite a medida do Y do triangulo: ");
        
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        System.out.println("====================================");
        
        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt (p* (p - xA)*(p - xB)*(p - xC));
        
        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p *(p - yA)*(p - yB)*(p - yC));
        
        System.out.printf("Area do triangulo X: %.4f%n", areaX);
        System.out.printf("Area do triangulo Y: %.4f%n", areaY);
        
        if(areaX > areaY){
           System.out.println("X é maior que Y. ");
        } else {
            System.out.println("Y é maior que X. ");
        }
        
    }
    
}
