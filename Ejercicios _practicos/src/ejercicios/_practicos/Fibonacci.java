/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios._practicos;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la cantidad de términos de la secuencia de Fibonacci
        System.out.print("Ingresa el número de términos: ");
        int n = scanner.nextInt();
        
        // Variables para almacenar los dos primeros términos de la secuencia
        int num1 = 0, num2 = 1;
        
        // Imprimir los primeros n términos de la secuencia de Fibonacci
        System.out.print("Los primeros " + n + " términos de la secuencia de Fibonacci son: ");
        
        // Casos especiales si n es menor o igual a 1
        if (n == 1) {
            System.out.println(num1);
        } else if (n >= 2) {
            System.out.print(num1 + " " + num2 + " ");
            for (int i = 3; i <= n; i++) {
                int siguiente = num1 + num2;  // Calcular el siguiente término
                System.out.print(siguiente + " ");
                num1 = num2;  // Actualizar num1 y num2 para el siguiente ciclo
                num2 = siguiente;
            }
            System.out.println();  // Nueva línea al final
        }
        
        scanner.close();
    }
}
