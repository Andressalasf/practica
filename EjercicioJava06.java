    package com.jmrh.ejerciciojava06;              // 1

import java.util.Scanner;                          // 1         

/**
 *
 * @authors 
 * 
 */
public class EjercicioJava06 {                      //1                                             //1                         

    private static Tablero tablero;                 // 1                            //1                                                            
    private static Scanner scanner;                 // 1                            //1                  
    private static boolean partidaEnJuego;          // 1                             //1
    // 4
    
    public static void main(String[] args) {        // 1                                 //1

        scanner = new Scanner(System.in);           // 1                            //1    
        menuPrincipal();                            //                             //52n**4 + 241n**3 + 205n**2 + 161n + 4
    }                                                                           //1
    
    //52n**4 + 241n**3 + 205n**2 + 161n + 7
    
    
    public static void menuPrincipal() {            // 1

        int opcion;     //1

        do { //n
            System.out.println("\nMenu Principal\n");                           //n
            System.out.println("1. Iniciar Nueva Partida");                     //n
            System.out.println("2. Continuar partida actual");                  //n
            System.out.println("3. Salir");                                     //n
            System.out.println("Introduce opción: ");                           //n
            
            try {                                                               //n
                opcion = Integer.parseInt(scanner.nextLine());                  //n
            } catch (Exception e) {                                             //n 
                opcion = 0;                                                     //n
            }                                                                   //n
            
            

            switch (opcion) {                                                   //n
                case 1:                                                         //n
                    iniciarPartida();                                           //26n**4 + 122n**3 + 165n**2 + 87n 
                    break;                                                      //n              
                case 2:                                                         //n
                    if(partidaEnJuego)                                          //n
                        continuarPartida();                                     //26n**4 + 119n**3 + 140n**2 + 48n 
                    else                                                        //n
                        System.out.println("No hay partida en juego");          //n
                    break;                                                      //n
                case 3:                                                         //n
                    System.out.println("Fin del juego");                        //n
                    break;                                                      //n
                default:                                                        //n
                    System.out.println("Opción desconocida");                   //n
            }                                                                   //n
            
        }while (opcion != 3);                                                   // n + 1                                                 //n + 1

    }                                                                           //1
    
    // 52n**4 + 241n**3 + 205n**2 + 161n + 4
    
    public static void iniciarPartida() {                                       //1
        tablero = new Tablero();                                                //25n+36  + 3n**2
        partidaEnJuego = true;                                                  //1
        juego();                                                                //259n+276+139n**2+26n**3  
    }                                                                           //1
    
    //284n+315+142n**2+26n**3 
    
    
    public static void continuarPartida() {                                     // 1
        juego();                                                                // 259n+276+139n**2+26n**3 
    }                                                                           // 1

    //259n+278+139n**2+26n**3
    
    
    
    public static void juego() {                                                //1
        String direccion;                                                       //1

        do {                                                                    // n+ 1
        tablero.mostrar();                                                      // 26n**3 + 20n**2 + 12n
        System.out.println("izq (a) / der (d) / arriba (w) / abajo (s) / menu (m): ");//n
        direccion = scanner.nextLine();                                         //n

        switch (direccion) {                                                    //n
            case "w":                                                           //n
                tablero.moverArriba();                                          // 12n**4 + 34n**3 + 53n**2 + 29n
                break;                                                          //n                                 
            case "s":                                                           //n                
                tablero.moverAbajo();                                           // 12**4 + 34n**3 + 52n**2 + 29n 
                break;                                                          //n    
            case "a":                                                           //n            
                tablero.moverIzquierda();                                       // 12n**4 + 34n**3 + 52n**2 + 29n
                break;                                                          //n
            case "d":                                                           //n    
                tablero.moverDerecha();                                         // 12n**4 + 34n**3 + 52n**2 + 28n
                break;                                                          //n
            case "m":                                                           //n
                System.out.println("Volviendo al menu...");                     //n        
                break;                                                          //n
            default:                                                            //n    
                System.out.println("Opción desconocida");                       //n        
        }                                                                       //n
                        
        } while(!direccion.equals("m") && !tablero.finPartida());               //7n**2 + 8n + 11

        if (tablero.finPartida()) {                                             // 7n**2 + 7n + 12
            tablero.mostrar();                                                  // 26n**2 + 20n +12
            String mensaje = tablero.ganador() ? "Has Ganado!!!" : "Has perdido";// 3n**2 + 3n + 5
            System.out.println(mensaje);                                        // 1
            partidaEnJuego = false;                                             // 1
        }                                                                       // 1

    }                                                                           // 1    
    //259n+276+139n**2+26n**3
}
