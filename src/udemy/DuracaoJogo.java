
package udemy;

import java.util.Scanner;


public class DuracaoJogo {
    
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        int horaInicial, horaFinal, duracaoJogo;
        
        System.out.println("Digite a hora INICIAL do jogo: ");
        horaInicial = sc.nextInt();
        System.out.println("Digite a hora FINAL do jogo: ");
        horaFinal = sc.nextInt();
        
                
        if(horaInicial < horaFinal){
            System.out.println("Duraçaõ do jogo " + (duracaoJogo = horaFinal - horaInicial));
        } else{
            System.out.println("Duração do jogo " + (duracaoJogo = 24 - horaInicial + horaFinal));
        }
            
        
        
        
        
    }
    
}
