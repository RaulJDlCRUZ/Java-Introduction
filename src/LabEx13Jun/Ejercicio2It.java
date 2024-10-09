/* 2. Crearemos la clase Ejercicio2, que tendrá un método principal que leerá un número entero (long) por teclado y
llamará al método invertirNumero que devolverá un número que estará formado por el mismo número, pero con las
cifras invertidas.
Ejemplo: Si introducimos el número 5892 el resultado debe ser el siguiente: 2985
    [ ] El método invertirNumero debe diseñarse como un método recursivo. (2 puntos).
    [*] Si se opta por una solución no recursiva (1,5 puntos)
*/
package LabEx13Jun;

import java.util.Scanner;

public class Ejercicio2It {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        long numero = teclado.nextLong();
        long invertido = invertirNumero(numero);
        System.out.println("El número invertido es: " + invertido);
    }

    public static long invertirNumero(long n) {
        long sol = 0;
        while (n >= 10) {
            sol = (sol + (n % 10)) * 10; // Las decenas las aplicamos una tras otras otra, se apilan solas
            n /= 10;
        }
        sol += n; // El último digito será, en lugar del 0, el primer dígito original
        return sol;
    }
}
