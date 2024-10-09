/* 2. Crearemos la clase Ejercicio2, que tendrá un método principal que leerá un número entero (long) por teclado y
llamará al método invertirNumero que devolverá un número que estará formado por el mismo número, pero con las
cifras invertidas.
Ejemplo: Si introducimos el número 5892 el resultado debe ser el siguiente: 2985
    [*] El método invertirNumero debe diseñarse como un método recursivo. (2 puntos).
    [ ] Si se opta por una solución no recursiva (1,5 puntos)
*/
package LabEx13Jun;

import java.util.Scanner;

public class Ejercicio2Str {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        long numero = teclado.nextLong();
        long invertido = Long.valueOf(invertirNumero(String.valueOf(numero)));
        System.out.println("El número " + numero + " invertido es " + invertido);
    }

    public static String invertirNumero(String n) {
        if (n.length() == 1) {
            return n;
        }
        // Voy a obtener el primer dígito con operadores de cadena
        String primerDigito = n.substring(n.length() - 1);
        // Voy concatenando el resto, recursivamente
        return primerDigito + invertirNumero(n.substring(0, n.length() - 1));
    }
}
