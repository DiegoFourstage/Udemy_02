/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

*/

package udemy;

import java.util.Locale;
import java.util.Scanner;


public class ValoresTriCirTraQuaRetan {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double a,b,c,triangulo, circulo, trapezio,quadrado, retangulo,pin = 3.14159;
        
        System.out.println("Digite a base: ");
        a = sc.nextDouble();
        
        System.out.println("Digite a altura: ");
        b = sc.nextDouble();
        
        System.out.println("Digite base2 ou altura2: ");
        c = sc.nextDouble();
        
        triangulo = a*c/2.0; // base * altura / por 2
        
        circulo = pin*c*c; // pi * altura * altura
        
        trapezio = (a+b)/2.0*c; // Area = (base + base2) / 2 * altura
        
        quadrado = a * a;
        
        retangulo = a * b;
        
        System.out.printf("Triangulo: %.3f%n", triangulo);
        System.out.printf("Circulo: %.3f%n", circulo);
        System.out.printf("Trapézio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retangulo: %.3f%n", retangulo);
        
        
        
        
        
        
    }
    
}
