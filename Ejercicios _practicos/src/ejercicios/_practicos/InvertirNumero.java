
package ejercicios._practicos;

import static ejercicios._practicos.Ejercicios_practicos.calcularPrimo;
import java.util.Scanner;

import java.util.Scanner;

public class InvertirNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar un número al usuario
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        // Variable para almacenar el número invertido
        int numeroInvertido = 0;

        // Proceso para invertir el número
        while (numero != 0) {
            int digito = numero % 10;          // Obtener el último dígito
            numeroInvertido = numeroInvertido * 10 + digito;  // Agregar el dígito al número invertido
            numero /= 10;                      // Eliminar el último dígito del número original
        }
        
        // Imprimir el número invertido
        System.out.println("Número invertido: " + numeroInvertido);
        
        scanner.close();
    }
}
