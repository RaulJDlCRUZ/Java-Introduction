/*
Diseñar un algoritmo recursivo para sumar los n primeros
números enteros, sumaRecursiva(n):
	a) Si n es 1, la suma es 1.
	b) Si n es mayor que 1 entonces será: n + sumaRecursiva(n-1).

Escriba un programa recursivo en Java que nos pida un número 
y calcule la suma de los n primeros números.
*/
package Session9;

import java.io.*;
import java.util.Scanner;

public class SumaPrimos {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Hasta que numero vas a sumar: ");
		int n = leer.nextInt();
		int respuesta = sumatorio(n);
		System.out.println("La respuesta es: " + respuesta);
	}

	public static int sumatorio(int n) {
		int valor;
		if (n == 1) {
			valor = 1;
		} else {
			valor = sumatorio(n - 1) + n;
		}
		return valor;
	}
}