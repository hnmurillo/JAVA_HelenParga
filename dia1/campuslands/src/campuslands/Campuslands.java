/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package campuslands;
/**
 *
 * @author camper
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Campuslands {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Opcion del usuario
        
        while (!salir) {
            System.out.println("------Menú-----");
            System.out.println("1. Coordinador");
            System.out.println("2. Trainer");
            System.out.println("3. Camper");
            System.out.println("4. Salir");

            try {
                System.out.println("Escriba una de las opciones");
                opcion = sn.nextInt(); // recibe el numero entero y lo compara 

                switch (opcion) {
                    case 1:
                        System.out.println("\n --- Entraste a Coordinador --- \n");
                        break;
                    case 2:
                        System.out.println("\n --- Entraste a Trainer --- \n");
                        break;
                    case 3:
                        System.out.println("\n --- Entraste a Camper --- \n");
                        break;
                    case 4:
                        System.out.println("\n --- Saliendo --- \n");
                        salir = true;
                        break;
                    default:
                        System.out.println("\n ---- Opción Incorrecta --- \n");
                }
            } catch (InputMismatchException e) {
                System.out.println("\n ---- Debes escribir números enteros --- \n");
                sn.next(); // Limpia el buffer del scanner para evitar un bucle infinito
            }
        }

        sn.close(); // Cierra el scanner al salir del bucle
    }
}
