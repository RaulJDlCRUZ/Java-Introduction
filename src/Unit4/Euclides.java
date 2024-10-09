/*
10. Sea el siguiente algoritmo propuesto por Euclides en sus Elementos, libro séptimo, para 
determinar el máximo común divisor de dos enteros, n y m, tal que n<m:
    a) Tómese el resto del cociente m/n
    b) Si el resto es cero, entonces n es el máximo común divisor
    c) Si el resto es distinto de cero se hace m=n y n=resto
    d) Se vuelve al punto a)
Escriba un programa que acepte dos números enteros leídos por teclado y determine su máximo 
común divisor aplicando el algoritmo de Euclides. Escriba un método que aplique el algoritmo. 
*/

package Unit4;

import java.util.Scanner;

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

        // Llamar al método para calcular el MCD
        int mcd = calcularMCD(n, m);
        System.out.println("El máximo común divisor de " + n + " y " + m + " es: " + mcd);
    }

    public static int calcularMCD(int n, int m) {
        // Mientras el resto no sea cero
        while (n != 0) {
            int resto = m % n; // Se calcula el resto de m / n
            m = n; // Se intercambian los valores
            n = resto;
        }
        return m; // El MCD es el último valor no nulo de m
    }

}
