/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package raiz_de_un_numero;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Raiz_de_un_numero {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("escriba un número: ");
            double num = scanner.nextDouble();
            if (num < 0) {
                System.out.println("no puede ser negativo el número.");
            } else {
                double raiz = Math.sqrt(num);
                System.out.println("la raíz cuadrada de: " + num + " es: " + raiz);
            }
        }
    }}
    
