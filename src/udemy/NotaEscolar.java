
package udemy;

import java.util.Locale;
import java.util.Scanner;


public class NotaEscolar {
    
    public static void main(String [] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double primeiroBimestre,segundoBimestre, notaFinal;
        String reprovado = "Reprovado ", aprovado = "Aprovado ";
        
        System.out.println("Nota do primeiro BIMESTRE: ");
        primeiroBimestre = sc.nextDouble();
        
        System.out.println("Nota do segundo BIMESTRE: ");
        segundoBimestre= sc.nextDouble();
        
        notaFinal = primeiroBimestre + segundoBimestre;
        
        if(notaFinal >=60.00){
            System.out.printf("Nota final: %.1f %s%n", notaFinal, aprovado);
        }else {
            System.out.printf("Nota final: %.1f%n ",notaFinal);
            System.out.printf("%s%n", reprovado);
        }
        
        
        
    }
    
}
