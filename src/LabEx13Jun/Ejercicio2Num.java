/* 2. Crearemos la clase Ejercicio2, que tendrá un método principal que leerá un número entero (long) por teclado y
llamará al método invertirNumero que devolverá un número que estará formado por el mismo número, pero con las
cifras invertidas.
Ejemplo: Si introducimos el número 5892 el resultado debe ser el siguiente: 2985
    [*] El método invertirNumero debe diseñarse como un método recursivo. (2 puntos).
    [ ] Si se opta por una solución no recursiva (1,5 puntos)
*/
package LabEx13Jun;

import java.util.Scanner;

public class Ejercicio2Num {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        long numero = teclado.nextLong();
        int cifras = numeroCifras(numero);
        long invertido = invertirNumero(numero, cifras);
        System.out.println("El número " + numero + " invertido es " + invertido);
    }

    // Explicado en: https://www.youtube.com/watch?v=8Kzsv7vq_NY
    public static long invertirNumero(long n, int cifras) {
        if (n < 10) {
            return n;
        }
        long digito = (n % 10);
        // Al aplicar 10 elevado a <n_cifra>, estamos invirtiendo el número
        long n2 = (long) (digito * Math.pow(10, cifras - 1));
        // Después, sumamos lo que queda del número, que es lo mismo pero otra vez, hasta caso base
        return n2 + invertirNumero(n / 10, cifras - 1);
    }

    // Ver Ejercicio03 de Ordinaria
    public static int numeroCifras(long numero) {
        if (numero >= 10) {
            return 1 + numeroCifras(numero / 10);
        }
        return 1;
    }
}
