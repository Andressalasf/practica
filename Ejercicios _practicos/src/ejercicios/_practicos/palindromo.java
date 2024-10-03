
package ejercicios._practicos;

import java.util.Scanner;


public class palindromo {
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingresa un palindromo");
        
        String word = scanner.nextLine();
        
       
        
        char [] caracteres = word.toCharArray();
        
         int j= caracteres.length-1;
         
         String new_word = "";
         
         for (int i = 0; i < caracteres.length; i++) {
             new_word += caracteres[j];
             j--;
             
         }
         
         
         
         System.out.println(new_word);
         
         if (word.equals(new_word)) {
             System.out.println("La palabra  " + word + " Es un palindromo");
         }else{
             System.out.println("La palabra " + word + " No es un palindromo");
         }
             
             
         
        
    }
}
