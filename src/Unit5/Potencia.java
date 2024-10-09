/* 6. Escriba un método recursivo que calcule la potencia n de un número x.
Use este método en un programa que lea el valor de x y de n y calcule e imprima por pantalla el resultado de la potencia.
*/
package Unit5;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe el número base: ");
        int base = teclado.nextInt();
        System.out.print("\nEscribe el exponente: ");
        int exp = teclado.nextInt();
        long resultado = potencia(base, exp);
        System.out.printf("%d^%d = %d", base, exp, resultado);
    }

    public static long potencia(int b, int e) {
        long numero = 0;
        if (e == 0) {
            numero = 1;
        } else {
            numero = b * potencia(b, e - 1);
        }
        return numero;
    }
}
