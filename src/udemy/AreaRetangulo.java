/*
CAlcule a area do rentangulo e me de o valor da area e o preço  da area:
*/
package udemy;

import java.util.Scanner;


public class AreaRetangulo {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        Double comprimento, largura, area, preco,preco2, precoMetrosQuadrados, areaTriangulo;
        
        System.out.println("Qual o comprimento? ");
        comprimento = sc.nextDouble();
        
        System.out.println("Qual a largura? ");
        largura = sc.nextDouble();
        
        System.out.println("Digite o preço do metro quadrado: ");
        precoMetrosQuadrados = sc.nextDouble();
        
        area = largura * comprimento;
        preco = area * precoMetrosQuadrados; 
        areaTriangulo = area / 2;
        preco2 = areaTriangulo * precoMetrosQuadrados;
        
        System.out.printf("Area do terreno é %.2f%n", area);
        System.out.printf("Preço da area retangula, Total: %.2f%n", preco);
        System.out.printf("Area do triangulo %.2f%n", areaTriangulo);
        System.out.printf("Preço da area TRiangula, Total: %.2f", preco2);
        
    }
    
}
