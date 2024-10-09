/*13.
    a) Escriba un método recursivo que implemente la siguiente función: 
        F(n) = 1                          si n=1 o n=2
        F(n) = F((n+1)/2)^2 + F((n-1)/2)^2  si n es impar
        F(n) = F(n/2 +1)^2 – F(n/2-1)^2     si n es par
    b) Escriba un método main que lea un número entero n e imprima el valor de la función para el n leído.
*/
package Unit5;

import java.util.Scanner;

public class Funcion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Esribe el número n para la función: ");
        int n = teclado.nextInt();
        int resultado = funcion(n);
        System.out.printf("F(%d) = %d", n, resultado);
    }

    public static int funcion(int n) {
        int fn = 0;
        if (n == 1 || n == 2) {
            fn = 1;
        } else if ((n % 2) != 0) {
            // F((n+1)/2)^2 + F((n-1)/2)^2
            fn = (int) Math.pow(funcion((n + 1) / 2), 2) + (int) Math.pow(funcion((n - 1) / 2), 2);
        } else {
            // F(n/2 +1)^2 – F(n/2-1)^2
            fn = (int) Math.pow(funcion(n / 2 + 1), 2) - (int) Math.pow(funcion(n / 2 - 1), 2);
        }
        return fn;
    }
}
