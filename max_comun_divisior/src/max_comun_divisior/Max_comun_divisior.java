/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package max_comun_divisior;

import java.util.Scanner;

/**
 *
 * @author steph
 */
public class Max_comun_divisior {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el primer número entero: ");
            int num1 = scanner.nextInt();  
            System.out.print("Ingrese el segundo número entero: ");
            int num2 = scanner.nextInt();
            int mcd = calcularMCD(num1, num2);
            System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es: " + mcd);
        }
    }
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
 }}