package ejercicios._practicos;          //1

import java.util.Arrays;                //1
import java.util.Scanner;               //1

public class dosPalabras {              //1 + 
    public static void main(String[] args) {              //1
       
        Scanner read = new Scanner(System.in);       //1
        
        System.out.println("Ingresa una palabra");      //1
        
        String word1 = read.nextLine();                   //1
        
         System.out.println("Ingresa una palabra");     //1
        
        String word2 = read.nextLine();                   //1
        
        word1.trim();                                     //1
        word2.trim();                                     //1
        
        
       char [] caracteres1 = word1.toLowerCase().toCharArray();         //n
       
       char [] caracteres2 = word2.toLowerCase().toCharArray();         //n
       
        if (word1.length()!= word2.length()) {                          //1
            System.out.println("No tienen la misma cantidad de letras, no pueden ser anagramas");       //1
        }                                                                                                 //1
       
        
       
        Arrays.sort(caracteres1);                                                                       //1 (n log n)
        Arrays.sort(caracteres2);                                                                       //1 o O(n log n)
        
        if (Arrays.equals(caracteres1, caracteres2)) {                                               //1+n
            System.out.println("cumple");                                                               //1
        }else{                                                                                            //1
            System.out.println("No cumple");                                                            //1
        }                                                                                                 //1
    }                                                                                                     //1
}                                                                                                         //1
