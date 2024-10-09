/* 3.- Diseña un programa en JAVA (class Ejercicio03), que leído un entero largo (long) por
teclado, nos calcule mediante una función recursiva el número de cifras que tiene el número.
(2 puntos) */

package LabOrdinario13Dic;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce el número: ");
        long l = leer.nextLong();
        int resultado = numeroCifras(l);
        System.out.println("El número " + l + " tiene " + resultado + " cifras.");
        leer.close();
    }

    // Por cada vez que un número sea divisible por 10, es una cifra = decena más
    public static int numeroCifras(long numero) {
        if (numero >= 10) {
            return 1 + numeroCifras(numero / 10);
        }
        // Le sumamos sólo 1 al ser la última. Por eso no es un else
        // Si no, reemplazaríamos todo por 1
        return 1;
    }
}
