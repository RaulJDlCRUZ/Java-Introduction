/* No queremos ejecutar cada vez para calcular un único factorial.
En cambio, se permitirá el cálculo de varios factoriales hasta que el 
usuario indique que quiere salir de la ejecución del programa.
*/
package Session4;

import java.util.Scanner;

public class FactorialMejorado {

    public static void main(String[] args) {
        /* Se usan doubles y no enteros para evitar overflows */
        char salir = ' ';
        Scanner leer = new Scanner(System.in);
        do {
            double fact = 1.0;
            System.out.println("Dime un número: ");
            int n = leer.nextInt();
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("El factorial de " + n + " es " + fact);
            System.out.println("¿Quieres calcular otro factorial? (s/n)");
            salir = leer.next().charAt(0); // Recogemos si queremos calcular otro factorial o no
        } while (salir == 's' || salir == 'S');
        System.out.println("Saliendo del programa...");
    }
}
