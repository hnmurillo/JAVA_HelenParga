//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.until.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Factura factura = null;

        while (true){
            System.out.printIn ("Bienvenido al sistema de facturacion");
            System.out.printIn("Menu");
            System.out.printIn("1. Crear Cliente");
            System.out.printIn("3. calcular total con descuento");
            System.out.printIn("4. Salir ");
            System.out.printIn("Seleccione una opción");
            int opcion = scanner.netxInt();
            scanner.nextLine(); //Limpiar  Buffer
        }

        switch (opcion){
            case 1 :
                System.out.print("Nombre del cliente");
                int nombreCliente = scanner.netxInt();
                System.out.print("Tipo de cliente (Regular/VIP)");
                int tipodeclinete = scanner.netxInt();
        }
    }
}