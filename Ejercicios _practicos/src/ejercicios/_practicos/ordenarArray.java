
package ejercicios._practicos;

import java.util.Scanner;


public class ordenarArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de elementos del array");
        
        int size = scanner.nextInt();
        
        int [] numbers = new int [size];
        
        
        for (int i = 0; i <numbers.length ; i++) {
            
            System.out.println("ingresa un numero");
            
            numbers[i] = scanner.nextInt();
        }
        
      
        for (int i = 0; i <numbers.length-1; i++) {
           
            for (int j = 0; j <numbers.length-1; j++) {
                
                if (numbers[j] > numbers[j+1]) {
                    
                    int temp  = numbers[j];
                    
                    numbers[j] = numbers[j+1];
                    
                    numbers[j+1] = temp;
                }
            }
            
        }
        
        for (int i = 0; i <numbers.length ; i++) {
            
            System.out.println(numbers[i]);
            
            
        }
        
        
        
    }
}
