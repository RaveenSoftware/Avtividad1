
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numProductos = random.nextInt(23) + 1;
        System.out.println("Se generaron " + numProductos + " productos");
        double total = 0;
        int i = 0;
        while (i < numProductos) {
            System.out.println(" nombre del producto " + (i + 1));
            String nombreProducto = sc.nextLine();

            System.out.println("cantidad del producto " + (i + 1));
            int cantidad = sc.nextInt();
            sc.nextLine();

            System.out.println("precio del producto " + (i + 1));
            double precio = sc.nextDouble();
            sc.nextLine();

            double subTotal = cantidad * precio;
            total += subTotal;
            System.out.println("Producto: " + nombreProducto + ", cantidad: " + cantidad + ", precio: " + precio + ", subTotal: " + subTotal);

           
            i++;
        }

       
        System.out.println("El total es: " + total);
        
    }
    
}
