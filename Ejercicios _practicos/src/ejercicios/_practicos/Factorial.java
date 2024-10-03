
package ejercicios._practicos;

import static ejercicios._practicos.Ejercicios_practicos.calcularPrimo;
import java.util.Scanner;


public class Factorial {
    
     public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
        
        System.out.println("ingresa un numero positivo");
        
        int num = read.nextInt();
        
        int fact = 1;
         for (int i = 1; i <=num ; i++) {
             
            fact *= i;
         }
         
         
        System.out.println("factorial de  " + num +  " es : " + fact);
       
            
    }
}
