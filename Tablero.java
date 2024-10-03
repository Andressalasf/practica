
package com.jmrh.ejerciciojava06;                                              

import java.util.Random;

/**
 *
 * @author
 */
public class Tablero {                                                          //1
    
    public static final int FIL = 4;                                            //1
    public static final int COL = 4;                                            //1
    private final int[][] tablero;                                              //1
    
    public Tablero() {                                                          //1
        tablero = new int[FIL][COL];                                            //1
        for(int f=0;f<FIL;f++) {                                                //n+1
            for(int c=0;c<COL;c++) {                                            //n**2+n
                tablero[f][c] = 0;                                              //n**2
            }                                                                   //n**2 
        }                                                                       //n
        
        ponerDos();                                                             //11n+14
        ponerDos();                                                             //11n+14
        
               
    }                                                                           //1
    
    
                                                                                //25n+36+3n**2
    
    
    private int vaciasEnFila(int f) {                                           //1    
        int n=0;                                                                //1
        for(int c=0;c<COL;c++) {                                                //n+1    
            if(tablero[f][c]==0) {                                              //n
                n++;                                                            //n
            }                                                                   //n
        }                                                                       //n    
        return n;                                                               //1
    }                                                                           //1            
    
    //5n+5
    
    
    private int vaciasEnColumna(int c) {                                        //1
        int n=0;                                                                //1
        for(int f=0;f<FIL;f++) {                                                //n+1
            if(tablero[f][c]==0) {                                              //n    
                n++;                                                            //n
            }                                                                   //n
        }                                                                       //n    
        return n;                                                               //1
    }                                                                           //1
    //5n+5
    
    private int vacias() {                                                      //1
        int n=0;                                                                //1
        for(int f=0;f<FIL;f++) {                                                //n+1        
            for(int c=0;c<COL;c++) {                                            //n**2+n
                if(tablero[f][c]==0) {                                          //n**2
                    n++;                                                        //n**2
                }                                                               //n**2    
            }                                                                   //n error n**2    
        }                                                                       //n    
        return n;                                                               //1
    }                                                                           //1
    
    //4n+5+4n**2
    
    
    private void ponerDos() {                                                   //1    
        int f;                                                                  //1
        int c;                                                                  //1
        
        Random random = new Random();                                           //1
        
        do {                                                                    //n+1    
            f = random.nextInt(FIL);                                            //n
        } while(vaciasEnFila(f) == 0);                                          //6n+5
        
        do {                                                                    //n+1
            c = random.nextInt(COL);                                            //n
        } while(tablero[f][c] != 0);                                            //n
        
        tablero[f][c] = 2;                                                      //1
        
    }                                                                           //1    
    //11n + 13
    
    public void mostrar() {                                                     //1
        for(int f=0;f<FIL;f++) {                                                //n+1
            dibujaLineaHorizontal();                                            // 4n+5+3n**2   
            dibujaEspacioHorizontal();                                          // 4n+5+3n**2    
            System.out.print("|");                                              //n
            for(int c=0;c<COL;c++) {                                            //n**2+n
                System.out.print("    ");                                       //n**2    
                if(tablero[f][c]>=1000)                                         //n**2
                    System.out.print(tablero[f][c]);                            //n**2
                else if(tablero[f][c] >= 100)                                   //n**2    
                    System.out.print(" "+tablero[f][c]);                        //n**2
                else if(tablero[f][c] >= 10)                                    //n**2
                    System.out.print(" "+tablero[f][c]+" ");                    //n**2
                else if(tablero[f][c] > 0)                                      //n**2
                    System.out.print("  "+tablero[f][c]+" ");                   //n**2
                else if(tablero[f][c] == 0)                                     //n**2
                    System.out.print("    ");                                   //n**2
                System.out.print("    |");                                      //n**2
            }                                                                   //n**2
            System.out.print("\n");                                             //n
            dibujaEspacioHorizontal();                                          //4n+5+3n**2
        }                                                                       //n
        dibujaLineaHorizontal();                                                // 4n+5+3n**2
    }                                                                           //1
    //26n**2 + 20n +12  
    
    private void dibujaLineaHorizontal() {                                      //1
        
        System.out.print("|");                                                  //1
        for(int c=0;c<COL;c++) {                                                //n+1
            for(int i=0;i<12;i++) {                                             //n**2+n
                System.out.print("-");                                          //n**2
            }                                                                   //n**2
            System.out.print("|");                                              //n
        }                                                                       //n
        System.out.print("\n");                                                 //1
        
    }                                                                           //1
    // 3n**2 + 4n + 5
    
     private void dibujaEspacioHorizontal() {                                   //1  
         System.out.print("|");                                                 //1
        for(int c=0;c<COL;c++) {                                                //n + 1
            for(int i=0;i<12;i++) {                                             //n**2 + n 
                System.out.print(" ");                                          //n**2 
            }                                                                   //n**2
            System.out.print("|");                                              //n
        }                                                                       //n
        System.out.print("\n");                                                 //1
    }                                                                           //1
     //3n**2 + 4n + 5
    
    public boolean ganador() {                                                  //1
        for(int f=0;f<FIL;f++) {                                                //n + 1           
            for(int c=0;c<COL;c++) {                                            //n^2 + n 
                if(tablero[f][c]==2048) return true;                            //n^2
            }                                                                   //n^2         
        }                                                                       //n  
        return false;                                                           //1
    }                                                                           //1
    // 3n**2 3n + 4
    
    public boolean finPartida() {                                               // 1    
        return (ganador() || vacias()==0);                                      // (3n+4+3n**2)+(4n+5+4n**2)=7n**2 7n + 9    
    }                                                                           // 1
    // 7n**2 + 7n + 11
    
    public void moverArriba() {                                                 //1
        for(int c=0; c<COL; c++) {                                              // n + 1
            moverArribaColumna(c);                                              // 12n**3 + 27n**2 + 33n
        }                                                                       // n
        if(!finPartida())                                                       // 7n**2 7n + 12  
                ponerDos();                                                     // 11n + 14
    }                                                                           //1
    //12n**3 + 34n**2 + 53n + 29
    
    private void moverArribaColumna(int c) {                                    // 1
        colocarArriba(c);                                                       // 6n**2 + 8n + 11 
        sumarArriba(c);                                                         // 11n + 10           
        colocarArriba(c);                                                       // 6n**2 + 8n + 11 
    }
    //12n**2 + 27n + 33
    
    private void colocarArriba(int c) {                                         //1
        
        if(vaciasEnColumna(c) < COL) {                                          // 5n + 6    
            for(int veces = 0;veces < COL-1;veces++) {                          // n + 1
                for(int f=0;f<FIL-1;f++) {                                      // n**2 + n
                    if(tablero[f][c]==0) {                                      // n**2
                        tablero[f][c] = tablero[f+1][c];                        // n**2
                        tablero[f+1][c] = 0;                                    // n**2
                    }                                                           // n**2
                }                                                               // n**2
            }                                                                   // n
        }                                                                       // 1
            
    }                                                                           //1    
    //  6n**2 + 8n + 11
    
    private void sumarArriba(int c) {                                           // 1
        if(vaciasEnColumna(c)<FIL-1) {                                          // 5n + 6
            for(int f=0;f<FIL-1;f++) {                                          // n + 1
                if(tablero[f][c] == tablero[f+1][c]) {                          // n
                    tablero[f][c] *= 2;                                         // n 
                    tablero[f+1][c] = 0;                                        // n
                }                                                               // n
            }                                                                   // n
        }                                                                       // 1
    }                                                                           // 1
    // 11n + 10    
    
    
    public void moverAbajo() {                                                  // 1
        for(int c=0; c<COL; c++) {                                              // n + 1
            moverAbajoColumna(c);                                               // n(12n**2 + 27n + 32)-> 12n**3 + 27n**2 + 32n 
        }                                                                       // n    
        if(!finPartida())                                                       // 7n**2 + 7n + 12
                ponerDos();                                                     // 11n+14
    }                                                                           // 1
    // 12**3 + 34n**2 + 52n + 29
    
    private void moverAbajoColumna(int c) {                                     // 1
        colocarAbajo(c);                                                        // 6n**2 + 8n + 10         
        sumarAbajo(c);                                                          // 11n + 10
        colocarAbajo(c);                                                        // 6n**2 + 8n + 10   
    }                                                                           // 1
    // 12n**2 + 27n + 32
   
    
    private void colocarAbajo(int c) {                                          //1                                    
        
        if(vaciasEnColumna(c) < COL) {                                          //5n + 6 
            for(int veces = 0;veces < COL-1;veces++) {                          // n + 1
                for(int f=FIL-1;f>0;f--) {                                      //n**2 + n
                    if(tablero[f][c]==0) {                                      //n**2
                        tablero[f][c] = tablero[f-1][c];                        //n**2    
                        tablero[f-1][c] = 0;                                    //n**2
                    }                                                           //n**2
                }                                                               //n**2
            }                                                                   //n
        }                                                                       //1
        
    }                                                                           //1   
    // 6n**2 + 8n + 10
    
    private void sumarAbajo(int c) {                                            // 1
        if(vaciasEnColumna(c)<FIL-1) {                                          // 5n + 6
            for(int f=FIL-1;f>0;f--) {                                          // n + 1
                if(tablero[f][c] == tablero[f-1][c]) {                          // n
                    tablero[f][c] *= 2;                                         // n  
                    tablero[f-1][c] = 0;                                        // n    
                }                                                               // n
            }                                                                   // n
        }                                                                       // 1
    }                                                                           // 1
    // 11n + 10
    
    
    public void moverDerecha() {                                                // 1
        for(int f=0; f<COL; f++) {                                              // n+1
            moverDerechaFila(f);                                                // n(12n**2 + 27n + 32)-> 12n**3 + 27n**2 + 32n
        }                                                                       // n    
        if(!finPartida())                                                       // 7n+11+7n**2
                ponerDos();                                                     // 11n+14
    }                                                                           // 1   
    //  12n**3 + 34n**2 + 52n + 28
    
    private void moverDerechaFila(int f) {                                    // 1
        colocarDerecha(f);                                                    // 6n**2 + 8n + 10
        sumarDerecha(f);                                                      // 11n + 10 
        colocarDerecha(f);                                                    // 6n**2 + 8n + 10
    }                                                                         // 1
    // 12n**2 + 27n + 32

    private void colocarDerecha(int f) {                                      // 1
        
        if(vaciasEnFila(f) < FIL) {                                           // 5n + 6
            for(int veces = 0;veces < COL-1;veces++) {                        // n + 1
                for(int c=COL-1;c>0;c--) {                                    // n**2 + n
                    if(tablero[f][c]==0) {                                    // n**2
                        tablero[f][c] = tablero[f][c-1];                      // n**2
                        tablero[f][c-1] = 0;                                  // n**2
                    }                                                         // n**2
                }                                                             // n**2
            }                                                                 // n
        }                                                                     // 1
        
    }                                                                         // 1
    // 6n**2 + 8n + 10
    
    
    private void sumarDerecha(int f) {                                          // 1 
        if(vaciasEnFila(f)<FIL-1) {                                             // 5n + 6
            for(int c=COL-1;c>0;c--) {                                          // n + 1
                if(tablero[f][c] == tablero[f][c-1]) {                          // n  
                    tablero[f][c] *= 2;                                         // n
                    tablero[f][c-1] = 0;                                        // n
                }                                                               // n  
            }                                                                   // n  
        }                                                                       // 1
    }                                                                           // 1
    // 11n + 10   
    
    
    public void moverIzquierda() {                                              //1
        for(int f=0; f<FIL; f++) {                                              //n+1
            moverIzquierdaFila(f);                                              //n(12n**2 + 27n + 32)-> 12n**3 + 27n**2 + 32n
        }                                                                       //n
        if(!finPartida())                                                       //1 + 7n+11+7n**2 -> 7n**2 + 7n + 12     
                ponerDos();                                                     //11n + 14
    }                                                                           //1 
    //  12n**3 + 34n**2 + 52n + 29                                                                             
    
    private void moverIzquierdaFila(int f) {               // 1 
        colocarIzquierda(f);                               // 6n**2 + 8n + 10
        sumarIzquierda(f);                                 // 11n + 10 
        colocarIzquierda(f);                               // 6n**2 + 8n + 10 
    }                                                       // 1
    // 12n**2 + 27n + 32
    
    private void colocarIzquierda(int f) {                  // 1
        
        if(vaciasEnFila(f) < FIL) {                         // 1 + 5n + 5 
            for(int veces = 0;veces < COL-1;veces++) {      // n + 1  
                for(int c=0;c<COL-1;c++) {                  // n(n + 1) -> n**2 + n  
                    if(tablero[f][c]==0) {                  // n**2  
                        tablero[f][c] = tablero[f][c+1];    // n**2
                        tablero[f][c+1] = 0;                // n**2
                    }                                       // n**2 
                }                                           // n**2 
            }                                               // n
        }                                                   // 1
        
    }                                                       // 1
    // 6n**2 + 8n + 10
    
    private void sumarIzquierda(int f) {                      // 1
        if(vaciasEnFila(f)<FIL-1) {                           // 1 + 5n + 5
            for(int c=0;c<COL-1;c++) {                        // n + 1
                if(tablero[f][c] == tablero[f][c+1]) {        // n
                    tablero[f][c] *= 2;                       // n
                    tablero[f][c+1] = 0;                      // n
                }                                             // n  
            }                                                 // n
        }                                                     // 1
    }                                                         // 1
    // 11n + 10
      
}