/* 2.- Diseña un programa en JAVA (class Ejercicio02), que pida por teclado un número y genere
un de un array con tantos elementos como el número leído. El método principal ya viene dado.

Diseñar un método o función llamado leerVector, que se pasa como parámetro el número de
elementos del array y devuelve un array de n números enteros generados al azar entre 1 y
100. (1punto)

Diseñar un método o función llamado ImprimirPares que pasemos como parámetro el array e
Imprima todos los elementos del array que sean pares. (1punto)
*/

package LabOrdinario13Dic;

import java.util.*;

public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Indica la dimension del vector: ");
		int n = leer.nextInt();
		int[] v;
		v = leerVector(n);
		imprimirPares(v);
		leer.close();
	}

	public static int[] leerVector(int n) {
		int[] aleatorios = new int[n];
		for (int i = 0; i < aleatorios.length; i++) {
			aleatorios[i] = 1 + (int) (Math.random() * 100);
		}
		return aleatorios;
	}

	public static void imprimirPares(int[] v) {
		for (int i = 0; i < v.length; i++) {
			if ((v[i] % 2) == 0) {
				System.out.println("Posición " + i + ": " + v[i]);
			}
		}
	}
}
