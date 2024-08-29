/*
- Escriba un método recursivo que calcule la potencia n de un 
  número x.
- Use este método en un programa que lea el valor de "x" y de "n" y
  calcule e imprima por pantalla el resultado de la potencia.
*/
package Session9;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int x, n, potencia;
        System.out.println("Introducir el numero x:");
        x = leer.nextInt();
        System.out.println("Introducir la potencia:");
        n = leer.nextInt(); // asegurarse que n>=0
        potencia = calcular_potencia(x, n);
        System.out.printf("La potencia de %d elevado a %d es %d\n", x, n, potencia);
        // Verificamos el resultado...
        System.out.println("La potencia con Math.pow(x,n) es:" +Math.pow(x, n));
    } // Fin del main

    public static int calcular_potencia(int x, int n) {
        /* La potencia n de un numero x se define recursivamente como x^n = x * x^(n-1) */
        // caso base: con n=0 valor de potencia 1
        int valor = 1;
        if (n > 0) {
            valor = x * calcular_potencia(x, n - 1);
        }
        return valor;
    } // Fin del método
}