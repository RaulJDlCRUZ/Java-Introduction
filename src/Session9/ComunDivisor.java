/*
Sea el siguiente algoritmo propuesto por Euclides en sus 
Elementos, libro séptimo, para determinar el máximo común 
divisor de dos enteros, n y m, tal que n<m:
	a) Tómese el resto del cociente m/n
	b) Si el resto es cero, entonces n es el máximo común divisor
	c) Si el resto es distinto de cero se hace m=n y n=resto
	d) Se vuelve al punto a)

- Escriba un programa recursivo que acepte dos números enteros 
  leídos por teclado y determine su máximo común divisor 
  aplicando el algoritmo de Euclides. Escriba un método que 
  aplique el algoritmo.
*/
package Session9;

import java.io.*;
import java.util.Scanner;

public class ComunDivisor {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Dime el primer entero o m: ");
		int m = leer.nextInt();
		System.out.println("Dime el segundo entero o n: ");
		int n = leer.nextInt();
		int cdiv = comundivisor(m, n);
		System.out.println("El CD segun el algoritmo de Euclides es: " + cdiv);
	}

	public static int comundivisor(int m, int n) {
		int resto = m % n;
		int valor;
		// Caso base: cuando resto de m/n = 0
		if (resto == 0) {
			valor = n;
		} else {
			// Caso inductivo: resto no es 0 -> invocar al algoritmo con m = n y n = resto
			m = n;
			n = resto;
			valor = comundivisor(m, n);
		}
		return valor;
	}
}