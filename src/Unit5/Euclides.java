/* 11. Sea el siguiente algoritmo propuesto por Euclides en sus Elementos, libro séptimo,
para determinar el máximo común divisor de dos enteros, n y m, tal que n<m:
    a) Tómese el resto del cociente m/n
    b) Si el resto es cero, entonces n es el máximo común divisor
    c) Si el resto es distinto de cero se hace m=n y n=resto
    d) Se vuelve al punto a)
Escriba un programa recursivo que acepte dos números enteros leídos por teclado y determine su 
máximo común divisor aplicando el algoritmo de Euclides. Escriba un método que aplique el algoritmo. 
*/

package Unit5;

import java.util.*;

public class Euclides {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número (n): ");
        int n = sc.nextInt();
        System.out.println("Introduce el segundo número (m): ");
        int m = sc.nextInt();

        // Asegurarse de que n sea menor que m, si no intercambiamos los valores
        if (n > m) {
            int temp = n;
            n = m;
            m = temp;
        }

        int mcd = calcularDivisorEuclides(n, m);
        System.out.println("El máximo común divisor de " + n + " y " + m + " es: " + mcd);
    }

    public static int calcularDivisorEuclides(int n, int m) {
        int valor = 0;
        if (n == 0) {
            valor = m;
        } else {
            int resto = m % n;
            valor = calcularDivisorEuclides(resto, n);
        }
        return valor;
    }
}