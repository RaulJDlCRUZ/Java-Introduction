package Session3;

import java.util.Scanner;

public class RaicesCuadradas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // se crea objeto tipo scanner
        // introducimos valores
        System.out.println("Donde a,b,c son los valores de la ecuación cuadrática ax^2+bx+c=0");
        System.out.println("Ingrese valor a: ");
        int a = leer.nextInt();
        System.out.println("Ingrese valor b: ");
        int b = leer.nextInt();
        System.out.println("Ingrese valor c: ");
        int c = leer.nextInt();

        // Calculamos el discriminate
        int discriminante = (b ^ 2) - (4 * a * c);
        // Comprobamos con el discriminante el tipo de solución o si no tiene solución
        if (discriminante > 0) {
            // Obtien los valores x1,x2 de la ecuacion
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            // Muestra los valores distintos x1 y x2
            System.out.println("La solucion de x1: " + x1);
            System.out.println("La solucion de x2: " + x2);
        } else if (discriminante == 0) {
            // Obtien los valores x1,x2 de la ecuacion
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            // Muestra la solución x1 y x2 iguales
            System.out.println("La solucion de x1 y x2: " + x1);
        } else {
            // Indica que no tiene solución.
            System.out.println("La ecuación no tiene solución");
        }

    }
}
