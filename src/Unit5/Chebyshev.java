/* 9. Dada la siguiente relación de recurrencia para evaluar el polinomio de Chebyshev de grado n para un x dado:
    T0(x)=1 para un polinomio de grado 0.
    T1(x)=x para un polinomio de grado 1.
    Tn(x)=2xTn-1(x)-Tn-2(x) para un polinomio de grado distinto de 0 y 1

Implemente un método recursivo que aplique dicha relación. Escriba un programa que, conociendo el 
grado del polinomio, calcule e imprima con 4 decimales el valor de dicho polinomio para un x dado. 
Los datos de entrada se deben proporcionar usando la clase Scanner y para la salida se usará el método 
printf
*/
package Unit5;

import java.util.Scanner;

public class Chebyshev {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        System.out.print("Ingrese el valor de x: ");
        double x = teclado.nextDouble();
        double resultado = polChebyshev(n, x);
        System.out.printf("T%d(%.4f) = %.4f%n", n, x, resultado);
    }

    public static double polChebyshev(int n, double x) {
        if (n == 0) {
            return 1.0;
        } else if (n == 1) {
            return x;
        } else {
            return 2 * x * polChebyshev(n - 1, x) - polChebyshev(n - 2, x);
        }
    }
}
