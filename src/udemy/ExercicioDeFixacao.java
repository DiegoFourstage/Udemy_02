/*
Aula de numero 14 Saída de dados em java
*/
package udemy;

import java.util.Locale;

public class ExercicioDeFixacao {

   
    public static void main(String[] args) {
        
        String product1 = "Computer ";
        String product2 = "Office desk ";
       
        int age = 30;
        int code = 5290;
        char gender ='F';
        
        Double price1 = 2100.0;
        Double price2 = 650.50;
        Double measure  = 53.234567;
        
        System.out.println("Products: ");
        System.out.printf("Computer, which price  is $ %.2f%n", price1 );
        System.out.printf("Office desk, which price is $ %.2f%n", price2 );
        
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        
        System.out.printf("Record: %d years old, %d and gender: %c%n ", age, code, gender);
        
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        
        System.out.printf("Measue with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (Three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
                
        
        
    }
    
}
