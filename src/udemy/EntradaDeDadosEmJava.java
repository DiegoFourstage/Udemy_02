/*
Aula de numero 18
*/
package udemy;

import java.util.Scanner;

public class EntradaDeDadosEmJava {
    
    public static void main(String [] args){
    
    Scanner sc = new Scanner(System.in);
   
   String name,name2; int house,idade; Double price, altura;
   
   System.out.println("Enter your full name: ");
   name = sc.nextLine();   
   
   System.out.println("How many bedrooms are there in your house? " );
   house = sc.nextInt();
   
   System.out.println("Enter product price ");
   price = sc.nextDouble();
   
   System.out.println("Enter your las name, age and height (Same line)");
   
   name2 = sc.next();
   idade = sc.nextInt();
   altura = sc.nextDouble();
   
   
   
   System.out.println(name);
   System.out.println(house);
   System.out.printf("%.2f%n", price);
   System.out.println(name2);
   System.out.println(idade);
   System.out.println(altura);
   
    
    
}
    
}
