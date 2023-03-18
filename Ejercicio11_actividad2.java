
package com.mycompany.ejercicio11_actividad2;
import java.util.Scanner;
public class Ejercicio11_actividad2 {

    public static void main(String[] args) {
      Scanner leerporteclado = new Scanner(System.in);
      
      double N1,N2, N3, Mayor;
      
        System.out.print("Ingrese el valor entero de N1: ");
        N1 = leerporteclado.nextDouble();
        
        System.out.print("Ingrese el valor entero de N2: ");
        N2 = leerporteclado.nextDouble();
        
        System.out.print("Ingrese el valor entero de N3: ");
        N3 = leerporteclado.nextDouble();
        
        
        if(N1>N2 && N1>N3){
            Mayor = N1;
        } else if(N2>N3) {
            Mayor = N2;
        } else {
            Mayor = N3;
        }
        
    System.out.print("el numero mayor entre: " +N1 + " , " + N2 + " , "+ N3 + " es " +Mayor);
    }
}
