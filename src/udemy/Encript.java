
package udemy;

import java.util.Scanner;

public class Encript {
    
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        
        String alfabeto = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String alfabeto2 = "8 F H G 3 l 1 L E I w o M X 6 Q P b V 9 a Z S D j r";
        String digite;
       
        
        String replaceAlfabeto = alfabeto.replace(alfabeto, alfabeto2);
        
        System.out.println ("Alfabeto original: " + alfabeto);
        System.out.println ("Alfabeto encriptado em homófona:" + replaceAlfabeto);
                
        
        System.out.println("Digite algo para encriptar: ");
        digite = sc.nextLine();
        
      
        System.out.println(digite.replace("a","q"));
        System.out.print(digite.replace("b","w"));
        System.out.print(digite.replace("c","e"));
        System.out.print(digite.replace("d","r"));
        System.out.print(digite.replace("e","t"));
        System.out.print(digite.replace("f","y"));
        System.out.print(digite.replace("g","u"));
        System.out.print(digite.replace("h","i"));
        System.out.print(digite.replace("i","o"));
        System.out.print(digite.replace("j","p"));
        System.out.print(digite.replace("k","a"));
        System.out.print(digite.replace("l","s"));
        System.out.print(digite.replace("m","d"));
        System.out.print(digite.replace("n","f"));
        System.out.print(digite.replace("o","g"));
        System.out.print(digite.replace("p","h"));
        System.out.print(digite.replace("q","j"));
        System.out.print(digite.replace("r","k"));
        System.out.print(digite.replace("s","l"));
        System.out.print(digite.replace("t","z"));
        System.out.print(digite.replace("u","x"));
        System.out.print(digite.replace("v","v"));
        System.out.print(digite.replace("w","b"));
        System.out.print(digite.replace("x","n"));
        System.out.print(digite.replace("y","m"));
        System.out.print(digite.replace("z","G"));
            
        
        }
        
    }
    

