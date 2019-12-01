
package udemy;

import java.util.Locale;
import java.util.Scanner;


public class SalarioDeUmFuncionario {
    
    public static void main(String [] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    
    int funcionario,horasTrabalhada;
    double valorHora,calculoSalario,salarioFuncionario;
    
    System.out.println("Quantidade de funcionarios: ");
    funcionario = sc.nextInt();
    System.out.println("Horas trabalhadas: ");
    horasTrabalhada = sc.nextInt();
    System.out.println("Valor da horas trabalhadas: ");
    valorHora = sc.nextDouble();    
    //System.out.println("Calculo do Salario ");
    //calculoSalario = sc.nextDouble();    
    
    salarioFuncionario = horasTrabalhada * valorHora;
    
    System.out.println("Quantidade de funcionario: " + funcionario );
    System.out.printf("Salario do funcionario U$ %.2f%n  ", salarioFuncionario );
        
        
    }
    
    
    
}
