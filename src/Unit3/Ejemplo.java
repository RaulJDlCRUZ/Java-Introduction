/* 4. ¿Qué hace este programa?
  a) Entra en el while cuando lee un entero que no sea 1 ó 2
  b) No entra en el while cuando lee el entero 1
  c) Siempre entra en el bucle while
  d) No entra en el while cuando lee el entero 2
*/

package Unit3;

import java.util.Scanner;

class Ejemplo {
    public static void main(String[] args) {
        int opcion;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Introduzca 1 o 2\n");
        opcion = lectura.nextInt();
        while (opcion != 1 || opcion != 2) { // Cuidado! siempre se cumple la condición, porque si es 1, no es 2 y viceversa...
            System.out.print("Opcion erronea, pruebe de nuevo\n");
            opcion = lectura.nextInt();
        } // Fin del while
    } // Fin del main
} // Fin clase

// Respuesta: c) Siempre entra en el bucle while