/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reemplazo_caracteres;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Reemplazo_caracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese una cadena de texto: ");
            String texto = scanner.nextLine();
            System.out.print("Ingrese el carácter que desea reemplazar: ");
            char caracteranterior = scanner.next().charAt(0);
            System.out.print("Ingrese el nuevo carácter: ");
            char nuevocaracter = scanner.next().charAt(0);
            String textoModificado = texto.replace(caracteranterior, nuevocaracter);
            System.out.println("Texto modificado: " + textoModificado);
        }
    }}
