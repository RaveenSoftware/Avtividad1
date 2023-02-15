/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author JAIME BAUTISTA
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese una palabra para invertirla:");

     
        Scanner lector = new Scanner(System.in);
        String palabra = lector.nextLine();

        
        String palabraInvertida = "";
        
        int longitud = palabra.length() - 1;

        
        while (longitud >= 0) {
            palabraInvertida += palabra.charAt(longitud);
            longitud--;
        }

       
        System.out.println( palabraInvertida);
        
        
        
        
    }
    
}
