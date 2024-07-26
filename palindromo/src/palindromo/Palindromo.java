/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Palindromo {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese una cadena de texto: ");
            String texto = scanner.nextLine();
            boolean esPalindromo = esPalindromo(texto);
            if (esPalindromo) {
                System.out.println("Es un palíndromo.");
            } else {
                System.out.println("No es un palíndromo.");
            }
        }
    }
   
    public static boolean esPalindromo(String texto) {
        String textoLimpio = texto.replaceAll("\\s+", "").toLowerCase();
        int longitud = textoLimpio.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (textoLimpio.charAt(i) != textoLimpio.charAt(longitud - 1 - i)) {
                return false;
            }
        }  
        return true; 
    }}
