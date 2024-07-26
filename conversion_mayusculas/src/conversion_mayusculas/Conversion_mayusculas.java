/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversion_mayusculas;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Conversion_mayusculas {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese palabras o cadenas de texto. El programa terminará cuando ingrese un espacio en blanco.");
            
            StringBuilder textoFinal = new StringBuilder();
            
            while (true) {
                
                System.out.print("Ingrese texto: ");
                String entrada = scanner.nextLine();
                if (entrada.trim().isEmpty()) {
                }
                textoFinal.append(entrada.toUpperCase()).append(" ");
            }
            System.out.println("Texto en mayúsculas: " + textoFinal.toString().trim());
        }
    }}   
