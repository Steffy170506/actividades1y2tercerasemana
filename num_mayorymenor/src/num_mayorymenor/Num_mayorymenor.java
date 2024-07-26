/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package num_mayorymenor;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Num_mayorymenor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] num = new int[8];
            
            // Leer 8 números enteros desde el teclado
            System.out.println("Ingrese 8 números enteros:");
            for (int i = 0; i < num.length; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                num[i] = scanner.nextInt();
            }
            int numeromayor = num[0];
            int numenor = num[0];
            for (int i = 1; i < num.length; i++) {
                if (num[i] > numeromayor) {
                    numeromayor = num[i];
                }
                if (num[i] < numenor) {
                    numenor = num[i];
                }
            }
            
            System.out.println("El número mayor es: " + numeromayor);
            System.out.println("El número menor es: " + numenor);
        }
    }
}
   
