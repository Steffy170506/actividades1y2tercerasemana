/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invertir_elementos;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Invertir_elementos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] num = new int[6];
            System.out.println("Ingrese 6 números enteros:");
            for (int i = 0; i < num.length; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                num[i] = scanner.nextInt();
            }
            int izquierda = 0;
            int derecha = num.length - 1;
            
            while (izquierda < derecha) {
                int temp = num[izquierda];
                num[izquierda] = num[derecha];
                num[derecha] = temp;
                izquierda++;
                derecha--;
            }
            
            System.out.println("Array invertido:");
            for (int numero : num) {
                System.out.print(numero + " ");
            }
            System.out.println();
        }
    }
}
    
