
package ejercicios._practicos;

import java.util.Scanner;


public class Ejercicios_practicos {

    
    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
        
        int [] listNumbers = {1,2,3,4,5,6,7,8,9};
        
       calcularPrimo(listNumbers);
            
    }
    
    public static void calcularPrimo(int[] listNumbers){
        
      
        int sumador = 1;
        
        for (int i = 0; i <listNumbers.length; i++) {
            
            int  contador = 0;
            int num = listNumbers[i];
            
            for (int j = 1; j <=num; j++) {
                
                if ( num% j == 0) {
                    contador++;
                }
            }
            
            if (contador == 2) {
                
                System.out.println(num+ "es primo");
                
            }else{
                System.out.println(num+ " No es primo");
                
            }
            
            sumador++;
        }
        
        
        
        
        
    }
    
}
