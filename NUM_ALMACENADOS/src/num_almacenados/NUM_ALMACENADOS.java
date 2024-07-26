/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package num_almacenados;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class NUM_ALMACENADOS {
    public static void main(String[] args) {
    
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[10];
            System.out.println("Ingrese 10 números enteros:");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }
            int conteoPares = 0;
            int conteoImpares = 0;
            
            for (int numero : numeros) {
                if (numero % 2 == 0) {
                    conteoPares++;
                } else {
                    conteoImpares++;
                }
            }
            System.out.println("Cantidad de números pares: " + conteoPares);
            System.out.println("Cantidad de números impares: " + conteoImpares);
        }
    }}