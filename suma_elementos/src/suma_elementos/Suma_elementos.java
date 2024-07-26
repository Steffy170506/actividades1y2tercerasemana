/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma_elementos;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Suma_elementos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] num = new int[5];
            System.out.println("Ingrese 5 números enteros:");
            for (int i = 0; i < num.length; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                num[i] = scanner.nextInt();
            }
            int suma = 0;
            for (int numero : num) {
                suma += numero;
            }
            System.out.println("La suma de todos los elementos es: " + suma);
        }
    }
}
   