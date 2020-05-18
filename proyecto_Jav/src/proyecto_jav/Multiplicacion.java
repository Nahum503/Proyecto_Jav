/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_jav;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Multiplicacion {
    
     public static void main(String[] args) {
        
    
          Scanner leer = new Scanner(System.in);
      
    double numero1, numero2, D;
    
        System.out.println("----MULTIPLICACION-----");
        
        System.out.println("Digite el primer valor");
        numero1 = leer.nextDouble();
        
         System.out.println("Digite el segundo valor");
        numero2 = leer.nextDouble();
        
        D = numero1 * numero2;
        
        System.out.println("-----------------------");
        System.out.println("Resultado" + D);
        System.out.println("-----------------------");
        
    }
}
